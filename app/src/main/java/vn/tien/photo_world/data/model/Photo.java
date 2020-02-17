package vn.tien.photo_world.data.model;

public class Photo {
    private String mId;
    private User mAuthor;
    private String mCreateDay;
    private String mDescription;
    private PhotoUrl mUrls;
    private PhotoLink mLinks;

    public Photo(String id, User author, String createDay, String description, PhotoUrl urls, PhotoLink links) {
        mId = id;
        mAuthor = author;
        mCreateDay = createDay;
        mDescription = description;
        mUrls = urls;
        mLinks = links;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public User getAuthor() {
        return mAuthor;
    }

    public void setAuthor(User author) {
        mAuthor = author;
    }

    public String getCreateDay() {
        return mCreateDay;
    }

    public void setCreateDay(String createDay) {
        mCreateDay = createDay;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public PhotoUrl getUrls() {
        return mUrls;
    }

    public void setUrls(PhotoUrl urls) {
        mUrls = urls;
    }

    public PhotoLink getLinks() {
        return mLinks;
    }

    public void setLinks(PhotoLink links) {
        mLinks = links;
    }
}
