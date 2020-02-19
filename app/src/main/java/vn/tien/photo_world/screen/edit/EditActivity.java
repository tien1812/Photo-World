package vn.tien.photo_world.screen.edit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import vn.tien.photo_world.R;
import vn.tien.photo_world.constant.Constant;

public class EditActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mImageEdit;
    private TextView mTextName;
    private CardView mCardView;
    private float mScale = 1f;
    private ScaleGestureDetector mDetector;
    private FloatingActionButton mBtSelectScreen;
    private ImageView mBtTune, mBtCrop, mBtDraw, mBtDownload, mBtFavorite;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        initView();
        getData();
        setListener();
    }

    private void setListener() {
        mBtSelectScreen.setOnClickListener(this);
        mBtTune.setOnClickListener(this);
        mBtDraw.setOnClickListener(this);
        mBtCrop.setOnClickListener(this);
        mBtDownload.setOnClickListener(this);
        mBtFavorite.setOnClickListener(this);
        mImageEdit.setOnClickListener(this);
    }

    private void getData() {
        Intent intent = getIntent();
        String url = intent.getStringExtra(Constant.KEY_IMAGE);
        String author = intent.getStringExtra(Constant.KEY_AUTHOR);
        Glide.with(mImageEdit.getContext()).load(url).centerCrop().into(mImageEdit);
        mTextName.setText(author);
    }

    private void initView() {
        mImageEdit = findViewById(R.id.image_edit);
        mTextName = findViewById(R.id.text_name_author);
        mCardView = findViewById(R.id.card_view);
        mDetector = new ScaleGestureDetector(this, new ScaleListener());
        mBtSelectScreen = findViewById(R.id.btn_setscreen);
        mBtTune = findViewById(R.id.image_tune);
        mBtDraw = findViewById(R.id.image_draw);
        mBtCrop = findViewById(R.id.image_crop);
        mBtDownload = findViewById(R.id.image_download);
        mBtFavorite = findViewById(R.id.image_favorite);
    }

    public static Intent getIntent(Context context) {
        Intent intent = new Intent(context, EditActivity.class);
        return intent;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_setscreen:
                sellectScreen();
                break;
            case R.id.image_tune:
                break;
            case R.id.image_crop:
                break;
            case R.id.image_draw:
                break;
            case R.id.image_download:
                break;
            case R.id.image_favorite:
                break;
            case R.id.image_edit:
                hideCardView();
                break;
            default:
                break;
        }
    }

    private void hideCardView() {
       mCardView.setVisibility(View.GONE);
    }


    private void sellectScreen() {
        final String[] Screens = {"Home screen", "Lock screen", "Both"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.title_dialog).setItems(Screens, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String sellect = Screens[i].toString();
                Toast.makeText(EditActivity.this, sellect, Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }


    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            mScale *= detector.getScaleFactor();
            mScale = Math.max(0.5f, Math.min(mScale, 2.5f));
            mImageEdit.setScaleX(mScale);
            mImageEdit.setScaleY(mScale);
            return true;
        }
    }
}
