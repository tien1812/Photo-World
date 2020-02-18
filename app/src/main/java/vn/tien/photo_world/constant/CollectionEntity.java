package vn.tien.photo_world.constant;

import androidx.annotation.StringDef;

@StringDef({
        CollectionEntity.AUTHOR,
        CollectionEntity.TITLE,
        CollectionEntity.TOTAL_PHOTOS,
        CollectionEntity.COVER_PHOTO,
})
public @interface CollectionEntity {
    String TITLE = "title";
    String AUTHOR = "user";
    String TOTAL_PHOTOS = "total_photos";
    String COVER_PHOTO = "cover_photo";
}
