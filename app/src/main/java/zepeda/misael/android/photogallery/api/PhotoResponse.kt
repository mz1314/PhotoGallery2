package zepeda.misael.android.photogallery.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import zepeda.misael.android.photogallery.api.GalleryItem

@JsonClass(generateAdapter = true)
data class PhotoResponse(
    @Json(name = "photo") val galleryItems: List<GalleryItem>
)
