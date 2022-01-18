package com.ilhmdhn.hotelui.data

import com.ilhmdhn.hotelui.R
import com.ilhmdhn.hotelui.model.HotelModel

object DummyHotel {

    private val picture = arrayOf(
        R.mipmap.tretesrayahotel,
        R.mipmap.papakanafarm,
        R.mipmap.suryahotel,
        R.mipmap.astonsidoarjo,
        R.mipmap.grandwhiz
    )

    private val name = arrayOf(
        "Tretes Raya Hotel",
        "OYO 3165 Papa Kana Farm",
        "Surya Hotel & Cottages Prigen",
        "ASTON Sidoarjo City Hotel",
        "Grand Whiz Hotel Trawas Mojokerto"
    )

    private val location = arrayOf(
        "Pasuruan, Jawa Timur",
        "Pacet, Mojokerto",
        "Prigen, Mojokerto",
        "Buduran, Sidoarjo",
        "Trawas, Mojokerto",
    )


    private val rating = arrayOf(
        4.5,
        4.7,
        4.2,
        4.3,
        4.4
    )

    private val price = arrayOf(
        "IDR 400.000",
        "IDR 165.000",
        "IDR 500.000",
        "IDR 562.451",
        "IDR 750.000",
    )

    val listHotel: ArrayList<HotelModel>
    get(){
        val list = arrayListOf<HotelModel>()
        for (position in picture.indices){
            val hotel = HotelModel()
            hotel.picture = picture[position]
            hotel.name = name[position]
            hotel.location = location[position]
            hotel.rating = rating[position]
            hotel.price = price[position]
            list.add(hotel)
        }
        return list
    }
}