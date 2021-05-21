package com.example.moviecatalogueapp.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.moviecatalogueapp.data.model.Movie
import com.example.moviecatalogueapp.databinding.ActivityDetailMovieBinding
import com.example.moviecatalogueapp.ui.main.viewmodel.DetailViewModel

class DetailMovieActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailMovieBinding
    private lateinit var viewModel: DetailViewModel
    private var data: Movie? = null

    companion object {
        const val DATA = "movie-data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViewModel()
        setupUI()
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(
            this@DetailMovieActivity,
            ViewModelProvider.NewInstanceFactory()
        )[DetailViewModel::class.java]
        val title = intent.getStringExtra(DATA) ?: ""
        viewModel.setMovie(title)
        data = viewModel.getMovie()
    }

    private fun setupUI() {
        binding.detailBack.setOnClickListener {
            finish()
        }
        Glide.with(this)
            .load(data?.poster)
            .into(binding.detailImg)
        binding.detailName.text = data?.title
        binding.detailPlot.text = data?.plot
        binding.detailDirector.text = data?.director
        binding.detailGenre.text = data?.genre
        binding.detailRuntime.text = data?.runtime
        binding.detailReleased.text = data?.released
    }
}