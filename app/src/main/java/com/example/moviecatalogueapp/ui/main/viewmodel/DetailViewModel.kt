package com.example.moviecatalogueapp.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import com.example.moviecatalogueapp.data.dummy.DummyData

class DetailViewModel : ViewModel(){
    private val refMovies = DummyData.movies()
    private val refTvShows = DummyData.tvShows()

    private lateinit var curMovie: String
    private lateinit var curTvShow: String

    fun setMovie(title: String){
        curMovie = title
    }

    fun getMovie() = refMovies.find { it.title == curMovie }

    fun setTvShow(name: String){
        curTvShow = name
    }

    fun getTvShow() = refTvShows.find { it.name == curTvShow }
}