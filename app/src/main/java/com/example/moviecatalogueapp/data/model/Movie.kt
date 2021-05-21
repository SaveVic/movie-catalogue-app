package com.example.moviecatalogueapp.data.model

import android.os.Parcel
import android.os.Parcelable

class Movie(
    val title: String,
    val released: String,
    val runtime: String,
    val genre: String,
    val director: String,
    val plot: String,
    val poster: String,
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

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(title)
        dest?.writeString(released)
        dest?.writeString(runtime)
        dest?.writeString(genre)
        dest?.writeString(director)
        dest?.writeString(plot)
        dest?.writeString(poster)
    }

    companion object CREATOR : Parcelable.Creator<Movie> {
        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }
}
