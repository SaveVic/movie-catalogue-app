package com.example.moviecatalogueapp.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import com.example.moviecatalogueapp.data.dummy.DummyData
import com.example.moviecatalogueapp.data.model.Movie
import com.example.moviecatalogueapp.data.model.TvShow

class MainViewModel : ViewModel() {

    fun getMovies() : List<Movie> = DummyData.movies()

    fun getTvShows() : List<TvShow> = DummyData.tvShows()

}