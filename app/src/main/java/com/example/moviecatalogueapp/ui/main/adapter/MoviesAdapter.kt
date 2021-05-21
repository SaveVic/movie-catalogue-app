package com.example.moviecatalogueapp.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviecatalogueapp.data.model.Movie
import com.example.moviecatalogueapp.databinding.ItemListBinding

class MoviesAdapter(
    private val movies: List<Movie>
) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    private var onItemClickCallback: OnItemClickCallback? = null
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(movie: Movie)
    }

    inner class ViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movie) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(movie.poster)
                    .into(itemImg)
                itemName.text = movie.title
                itemView.setOnClickListener { onItemClickCallback?.onItemClicked(movie) }

            }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val binding =
            ItemListBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount(): Int = movies.size

//    fun replaceList(newMovies: List<Movie>) {
//        movies.clear()
//        movies.addAll(newMovies)
//    }
}
