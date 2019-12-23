package vn.tien.photo_world.data.model;

import java.util.List;

public class Photo {
    private String mId;
    private String mAuthor;
    private String mCreatDay;
    private int mWidth;
    private int mHeight;
    private String mDescription;
    private PhotoUrls mUrls;
    private PhotoLinks mLinks;

    public Photo(String mId,
                 String mAuthor,
                 String mCreatDay,
                 int mWidth,
                 int mHeight,
                 String mDescription,
                 PhotoUrls mUrls,
                 PhotoLinks mLinks) {
        this.mId = mId;
        this.mAuthor = mAuthor;
        this.mCreatDay = mCreatDay;
        this.mWidth = mWidth;
        this.mHeight = mHeight;
        this.mDescription = mDescription;
        this.mUrls = mUrls;
        this.mLinks = mLinks;
    }


    public Photo() {
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        this.mAuthor = author;
    }

    public String getCreatDay() {
        return mCreatDay;
    }

    public void setCreatDay(String creatDay) {
        this.mCreatDay = creatDay;
    }

    public int getWidth() {
        return mWidth;
    }

    public void setWidth(int width) {
        this.mWidth = width;
    }

    public int getHeight() {
        return mHeight;
    }

    public void setHeight(int height) {
        this.mHeight = height;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public PhotoUrls getUrls() {
        return mUrls;
    }

    public void setUrls(PhotoUrls urls) {
        this.mUrls = urls;
    }

    public PhotoLinks getLinks() {
        return mLinks;
    }

    public void setLinks(PhotoLinks links) {
        this.mLinks = links;
    }

}
