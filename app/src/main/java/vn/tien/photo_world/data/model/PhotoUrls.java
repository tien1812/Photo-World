package vn.tien.photo_world.data.model;

public class PhotoUrls {
    private String mRaw;
    private String mFull;
    private String mRegular;
    private String mSmall;
    private String mThump;

    public PhotoUrls(String raw, String full, String regular, String small, String thump) {
        this.mRaw = raw;
        this.mFull = full;
        this.mRegular = regular;
        this.mSmall = small;
        this.mThump = thump;
    }

    public PhotoUrls() {
    }

    public String getRaw() {
        return mRaw;
    }

    public void setRaw(String raw) {
        this.mRaw = raw;
    }

    public String getFull() {
        return mFull;
    }

    public void setFull(String full) {
        this.mFull = full;
    }

    public String getRegular() {
        return mRegular;
    }

    public void setRegular(String regular) {
        this.mRegular = regular;
    }

    public String getSmall() {
        return mSmall;
    }

    public void setSmall(String small) {
        this.mSmall = mSmall;
    }

    public String getThump() {
        return mThump;
    }

    public void setThump(String thump) {
        this.mThump = thump;
    }
}
