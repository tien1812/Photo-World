package vn.tien.photo_world.constant;

import androidx.annotation.StringDef;

@StringDef({
        CollectionEntity.AUTHOR,
        CollectionEntity.TITLE,
        CollectionEntity.DESCRIPTION,
        CollectionEntity.TOTAL_PHOTOS,
        CollectionEntity.PHOTO,
        CollectionEntity.PULISHED
})
public @interface CollectionEntity {
    String TITLE = "title";
    String DESCRIPTION = "description";
    String AUTHOR = "user";
    String TOTAL_PHOTOS = "total_photos";
    String PHOTO = "cover_photo";
    String PULISHED = "published_at";
}
