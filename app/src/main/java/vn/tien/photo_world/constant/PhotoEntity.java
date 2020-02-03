package vn.tien.photo_world.constant;

import androidx.annotation.StringDef;

@StringDef({
        PhotoEntity.PHOTOS,
        PhotoEntity.ID,
        PhotoEntity.AUTHOR,
        PhotoEntity.CREAT_DAY,
        PhotoEntity.DESCRIPTION,
        PhotoEntity.PHOTO_URL,
        PhotoEntity.PHOTO_LINK,
})
public @interface PhotoEntity {
    String PHOTOS = "";
    String ID = "id";
    String AUTHOR = "user";
    String CREAT_DAY = "created_at";
    String DESCRIPTION = "alt_description";
    String PHOTO_URL = "urls";
    String PHOTO_LINK = "links";
}
