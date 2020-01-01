package vn.tien.photo_world.data.source;

import java.util.List;

import vn.tien.photo_world.data.model.Photo;

public interface DataSource {
    interface OnFetchDataListener<T> {
        void onFetchDataSuccess(List<Photo> data );

        void onFetchDataFailure(Exception e);
    }
}
