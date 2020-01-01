package vn.tien.photo_world.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import vn.tien.photo_world.R;
import vn.tien.photo_world.adapters.PhotoAdapter;
import vn.tien.photo_world.constant.Constant;
import vn.tien.photo_world.data.model.Photo;
import vn.tien.photo_world.data.source.DataSource;
import vn.tien.photo_world.data.source.FecthPhotofromApi;

public class HomeFragment extends Fragment implements DataSource.OnFetchDataListener<Photo> {
    private RecyclerView mRecyclerView;
    private PhotoAdapter mAdapter;
    private static final String TAG = HomeFragment.class.getSimpleName();
    private List<Photo> mPhotoList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mRecyclerView = view.findViewById(R.id.recycler_home);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1));
        mRecyclerView.setHasFixedSize(true);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FecthPhotofromApi fecthPhotofromApi = new FecthPhotofromApi();
        fecthPhotofromApi.setListener(this);
        fecthPhotofromApi.execute(Constant.BASE_URL);
    }

    @Override
    public void onFetchDataSuccess(List<Photo> data) {
        mAdapter = new PhotoAdapter(getContext(), data);
        mRecyclerView.setAdapter(mAdapter);
        mPhotoList = data;
    }

    @Override
    public void onFetchDataFailure(Exception e) {
    }

    public void beginSearch(String newText) {
        final List<Photo> filteredList = filter(mPhotoList, newText);
        mAdapter.setSearchResult(filteredList);
    }

    private List<Photo> filter(List<Photo> photos, String query) {
        query = query.toLowerCase();
        final List<Photo> filteredPhotos = new ArrayList<>();
        for (Photo photo : photos) {
            final String text = photo.getAuthor().getName().toLowerCase();
            if (text.contains(query)) {
                filteredPhotos.add(photo);
            }
        }
        return filteredPhotos;
    }
}
