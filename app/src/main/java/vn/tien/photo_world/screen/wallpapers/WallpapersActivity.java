package vn.tien.photo_world.screen.wallpapers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

import vn.tien.photo_world.R;
import vn.tien.photo_world.constant.Constant;
import vn.tien.photo_world.data.model.Wallpapers;

public class WallpapersActivity extends AppCompatActivity {
    private RecyclerView mRclWallpaper;
    private WallpaperAdapter mAdapter;
    private List<Wallpapers> mWallpapers;
    private String mUrl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpapers);
        mRclWallpaper = findViewById(R.id.recycler_wallpaper);
        getDatafromCollction();
        mWallpapers = new ArrayList<>();
        mRclWallpaper.
                setLayoutManager(new GridLayoutManager(WallpapersActivity.this,1));
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        StringRequest stringRequest =
                new StringRequest(Request.Method.GET, mUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                String link = "";
                Document document = Jsoup.parse(response);
                if (document != null) {
                    Elements elements = document.select("img._2zEKz");
                    for (Element element : elements) {
                        Element element1 = element.getElementsByTag("img").first();
                        if (element1 != null){
                            link =element1.attr("src");
                        }
                        mWallpapers.add(new Wallpapers(link));
                    }
                    mAdapter = new WallpaperAdapter(WallpapersActivity.this,mWallpapers);
                    mRclWallpaper.setAdapter(mAdapter);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(stringRequest);
    }

    private void getDatafromCollction() {
        Intent intent = getIntent();
        mUrl = intent.getStringExtra(Constant.KEY_HTML);
    }

    public static Intent getIntent(Context context) {
        Intent intent = new Intent(context, WallpapersActivity.class);
        return intent;
    }
}
