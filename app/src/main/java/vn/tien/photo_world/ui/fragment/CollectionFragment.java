package vn.tien.photo_world.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

import vn.tien.photo_world.R;
import vn.tien.photo_world.data.model.Collection;
import vn.tien.photo_world.data.source.DataSource;

public class CollectionFragment extends Fragment implements DataSource.OnFetchDataListener<Collection> {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_collection, container, false);
        return view;
    }

    @Override
    public void onFetchDataSuccess(List data) {

    }

    @Override
    public void onFetchDataFailure(Exception e) {

    }


    public void beginSearch(String newText) {
    }
}
