package com.ilhmdhn.hotelui.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HotelModel(
    var picture: Int = 0,
    var name: String = "",
    var location: String = "",
    var rating: Double = 0.0,
    var price: String = "",
): Parcelable
