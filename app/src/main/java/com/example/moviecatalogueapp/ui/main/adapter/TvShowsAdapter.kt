package com.example.moviecatalogueapp.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviecatalogueapp.data.model.TvShow
import com.example.moviecatalogueapp.databinding.ItemListBinding

class TvShowsAdapter(
    private val tvShows: List<TvShow>
) : RecyclerView.Adapter<TvShowsAdapter.ViewHolder>() {

    private var onItemClickCallback: OnItemClickCallback? = null
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(tvShow: TvShow)
    }

    inner class ViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: TvShow) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(tvShow.imagePath)
                    .into(itemImg)
                itemName.text = tvShow.name
                itemView.setOnClickListener { onItemClickCallback?.onItemClicked(tvShow) }

            }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val binding =
            ItemListBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(tvShows[position])
    }

    override fun getItemCount(): Int = tvShows.size

//    fun replaceList(newTvShows: List<TvShow>) {
//        tvShows.clear()
//        tvShows.addAll(newTvShows)
//    }
}
