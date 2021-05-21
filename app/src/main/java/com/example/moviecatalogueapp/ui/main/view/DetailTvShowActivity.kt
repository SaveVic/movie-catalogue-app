package com.example.moviecatalogueapp.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.moviecatalogueapp.data.model.TvShow
import com.example.moviecatalogueapp.databinding.ActivityDetailTvShowBinding
import com.example.moviecatalogueapp.ui.main.viewmodel.DetailViewModel

class DetailTvShowActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailTvShowBinding
    private lateinit var viewModel: DetailViewModel
    private var data: TvShow? = null

    companion object{
        const val DATA = "tv-show-data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailTvShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        data = intent.getParcelableExtra(DATA)

        setupViewModel()
        setupUI()
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(
            this@DetailTvShowActivity,
            ViewModelProvider.NewInstanceFactory()
        )[DetailViewModel::class.java]
        val name = intent.getStringExtra(DATA) ?: ""
        viewModel.setTvShow(name)
        data = viewModel.getTvShow()
    }

    private fun setupUI() {
        binding.detailBack.setOnClickListener {
            finish()
        }
//        Log.e("Data is null", (data == null).toString())
        Glide.with(this)
            .load(data?.imagePath)
            .into(binding.detailImg)
        binding.detailName.text = data?.name
        binding.detailDescription.text = data?.description
        binding.detailGenre.text = data?.genres
        binding.detailRating.text = data?.rating
        binding.detailRatingCount.text = data?.ratingCount
        binding.detailStartDate.text = data?.startDate
    }
}