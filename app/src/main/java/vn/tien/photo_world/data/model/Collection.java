package vn.tien.photo_world.data.model;

public class Collection {
    private String mTitle;
    private User mUser;
    private int mTotalPhotos;
    private PhotoUrl mUrl;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public int getTotalPhotos() {
        return mTotalPhotos;
    }

    public void setTotalPhotos(int totalPhotos) {
        mTotalPhotos = totalPhotos;
    }

    public PhotoUrl getUrl() {
        return mUrl;
    }

    public void setUrl(PhotoUrl url) {
        mUrl = url;
    }

    public Collection(String title, User user, int totalPhotos, PhotoUrl url) {
        mTitle = title;
        mUser = user;
        mTotalPhotos = totalPhotos;
        mUrl = url;
    }
}
