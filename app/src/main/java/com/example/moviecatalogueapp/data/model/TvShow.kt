package com.example.moviecatalogueapp.data.model

import android.os.Parcel
import android.os.Parcelable

class TvShow(
    val name: String,
    val description: String,
    val startDate: String,
    val imagePath: String,
    val rating: String,
    val ratingCount: String,
    val genres: String,
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
    )

//    constructor(_json: JSONObject) : this() {
//        name = _json.optString("name")
//        description = _json.optString("description")
//        startDate = _json.optString("start_date")
//        imagePath = _json.optString("image_path")
//        rating = _json.optString("rating")
//        ratingCount = _json.optString("rating_count")
//        genres = _json.optString("genres")
//    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(name)
        dest?.writeString(description)
        dest?.writeString(startDate)
        dest?.writeString(imagePath)
        dest?.writeString(rating)
        dest?.writeString(ratingCount)
        dest?.writeString(genres)
    }

    companion object CREATOR : Parcelable.Creator<TvShow> {
        override fun createFromParcel(parcel: Parcel): TvShow {
            return TvShow(parcel)
        }

        override fun newArray(size: Int): Array<TvShow?> {
            return arrayOfNulls(size)
        }
    }

}