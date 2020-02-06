package vn.tien.photo_world.data.model;

public class Collection {
    private String mTitle;
    private String mDescription;
    private String mPulished;
    private Author mAuthor;
    private int mTotalPhotos;
    private Photo mCoverPhoto;

    public Collection(String title, String description,
                      String pulished, Author author,
                      int totalPhotos, Photo coverPhoto) {
        mTitle = title;
        mDescription = description;
        mPulished = pulished;
        mAuthor = author;
        mTotalPhotos = totalPhotos;
        mCoverPhoto = coverPhoto;
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

    public String getPulished() {
        return mPulished;
    }

    public void setPulished(String pulished) {
        mPulished = pulished;
    }

    public Author getAuthor() {
        return mAuthor;
    }

    public void setAuthor(Author author) {
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
