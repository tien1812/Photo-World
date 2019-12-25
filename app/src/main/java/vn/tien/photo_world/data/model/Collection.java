package vn.tien.photo_world.data.model;

public class Collection {
    private int mId;
    private String mTitle;
    private String mDescription;
    private String mAuthor;
    private int mTotalPhotos;
    private Photo mCoverPhoto;
    private CollectionLinks mLinks;

    public Collection(int id,
                      String title,
                      String description,
                      String author,
                      int totalPhotos,
                      Photo coverPhoto,
                      CollectionLinks links) {
        this.mId = id;
        this.mTitle = title;
        this.mDescription = description;
        this.mAuthor = author;
        this.mTotalPhotos = totalPhotos;
        this.mCoverPhoto = coverPhoto;
        this.mLinks = links;
    }

    public Collection() {
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        this.mAuthor = author;
    }

    public int getTotalPhotos() {
        return mTotalPhotos;
    }

    public void setTotalPhotos(int totalPhotos) {
        this.mTotalPhotos = totalPhotos;
    }

    public Photo getCoverPhoto() {
        return mCoverPhoto;
    }

    public void setCoverPhoto(Photo coverPhoto) {
        this.mCoverPhoto = coverPhoto;
    }

    public CollectionLinks getLinks() {
        return mLinks;
    }

    public void setLinks(CollectionLinks links) {
        this.mLinks = links;
    }
}
