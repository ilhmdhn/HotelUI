package com.ilhmdhn.hotelui.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ilhmdhn.hotelui.databinding.ListHotelsBinding
import com.ilhmdhn.hotelui.model.HotelModel

class HomeAdapter(private val listHotel: ArrayList<HotelModel>): RecyclerView.Adapter<HomeAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val listHotelBinding = ListHotelsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(listHotelBinding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val listHotel = listHotel[position]
        holder.bind(listHotel)
    }

    class ListViewHolder(val binding: ListHotelsBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(hotelModel: HotelModel){
            binding.tvNameHotel.text = hotelModel.name
            binding.tvHotelLocation.text = hotelModel.location
            binding.tvHotelRating.text = hotelModel.rating.toString()
            binding.tvPrice.text = hotelModel.price.toString()
            with(binding){
                Glide.with(itemView.context)
                    .load(hotelModel.picture)
                    .into(imgHotel)
            }
        }
    }

    override fun getItemCount(): Int =
        listHotel.size
}