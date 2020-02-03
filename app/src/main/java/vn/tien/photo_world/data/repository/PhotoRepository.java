package vn.tien.photo_world.data.repository;

import vn.tien.photo_world.data.source.PhotoDataSource;
import vn.tien.photo_world.data.source.PhotoRemoteDataSource;

public class PhotoRepository {
    private static PhotoRepository sInstance;
    private PhotoRemoteDataSource mPhotoRemoteDataSource;

    private PhotoRepository(PhotoRemoteDataSource photoRemoteDataSource) {
        mPhotoRemoteDataSource = photoRemoteDataSource;
    }

    public static PhotoRepository getInstance() {
        if (sInstance == null) {
            sInstance = new PhotoRepository(PhotoRemoteDataSource.getInstance());
        }
        return sInstance;
    }

    public void getPhoto(PhotoDataSource.OnFetchDataListener listener) {
        mPhotoRemoteDataSource.getPhoto(listener);
    }
}
