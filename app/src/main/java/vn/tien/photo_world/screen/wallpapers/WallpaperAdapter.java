package vn.tien.photo_world.screen.wallpapers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import vn.tien.photo_world.R;
import vn.tien.photo_world.data.model.Wallpapers;

public class WallpaperAdapter extends RecyclerView.Adapter<WallpaperAdapter.ViewHoder> {
    private List<Wallpapers> mWallpapers;
    private Context mContext;

    public WallpaperAdapter(Context context, List<Wallpapers> wallpapers) {
        mWallpapers = wallpapers;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.
                from(parent.getContext()).inflate(R.layout.item_wallpaper,parent,false);
        return new ViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {
        Wallpapers wallpapers = mWallpapers.get(position);
        Glide.with(holder.mWallpaper.getContext())
                .load(wallpapers.getLinkWallpaper()).centerCrop()
                .into(holder.mWallpaper);
    }

    @Override
    public int getItemCount() {
        return mWallpapers == null ? 0 : mWallpapers.size();
    }

    public static class ViewHoder extends RecyclerView.ViewHolder {
        private ImageView mWallpaper;

        public ViewHoder(@NonNull View itemView) {
            super(itemView);
            mWallpaper = itemView.findViewById(R.id.img_wallpaper);
        }
    }
}
