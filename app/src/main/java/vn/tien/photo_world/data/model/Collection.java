package vn.tien.photo_world.data.model;

public class Collection {
    private int mId;
    private String mTitle;
    private String mDescription;
    private String mAuthor;
    private int mTotalPhotos;
    private Photo mCoverPhoto;

    public Collection(int id, String title, String description, String author, int totalPhotos, Photo coverPhoto) {
        mId = id;
        mTitle = title;
        mDescription = description;
        mAuthor = author;
        mTotalPhotos = totalPhotos;
        mCoverPhoto = coverPhoto;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        mAuthor = author;
    }

    public int getTotalPhotos() {
        return mTotalPhotos;
    }

    public void setTotalPhotos(int totalPhotos) {
        mTotalPhotos = totalPhotos;
    }

    public Photo getCoverPhoto() {
        return mCoverPhoto;
    }

    public void setCoverPhoto(Photo coverPhoto) {
        mCoverPhoto = coverPhoto;
    }
}
