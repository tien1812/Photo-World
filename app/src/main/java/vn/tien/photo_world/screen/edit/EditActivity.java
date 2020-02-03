package vn.tien.photo_world.screen.edit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import vn.tien.photo_world.R;

public class EditActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
    }

    public static Intent getIntent(Context context) {
        Intent intent = new Intent(context, EditActivity.class);
        return intent;
    }
}
