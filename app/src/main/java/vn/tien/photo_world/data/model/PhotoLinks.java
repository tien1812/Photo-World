package vn.tien.photo_world.data.model;

public class PhotoLinks {
    private String mSelf ;
    private String mHtml ;
    private String mDownload ;

    public PhotoLinks(String self, String html, String download) {
        this.mSelf = self;
        this.mHtml = html;
        this.mDownload = download;
    }

    public PhotoLinks() {
    }

    public String getSelf() {
        return mSelf;
    }

    public void setSelf(String self) {
        this.mSelf = self;
    }

    public String getHtml() {
        return mHtml;
    }

    public void setHtml(String html) {
        this.mHtml = html;
    }

    public String getDownload() {
        return mDownload;
    }

    public void setDownload(String download) {
        this.mDownload = download;
    }
}
