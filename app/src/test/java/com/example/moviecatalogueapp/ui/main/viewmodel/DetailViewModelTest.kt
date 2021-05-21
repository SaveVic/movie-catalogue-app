package com.example.moviecatalogueapp.ui.main.viewmodel

import com.example.moviecatalogueapp.data.dummy.DummyData
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailViewModelTest {
    private val refMovie = DummyData.movies()[0]
    private val refTvShow = DummyData.tvShows()[0]
    private val curMovie = refMovie.title
    private val curTvShow = refTvShow.name

    private lateinit var viewModel: DetailViewModel

    @Before
    fun setup(){
        viewModel = DetailViewModel()
        viewModel.setMovie(curMovie)
        viewModel.setTvShow(curTvShow)
    }

    @Test
    fun getMovie() {
        val movie = viewModel.getMovie()
        assertNotNull(movie)
        assertEquals(refMovie.poster, movie?.poster)
        assertEquals(refMovie.title, movie?.title)
        assertEquals(refMovie.plot, movie?.plot)
        assertEquals(refMovie.released, movie?.released)
        assertEquals(refMovie.runtime, movie?.runtime)
        assertEquals(refMovie.genre, movie?.genre)
        assertEquals(refMovie.director, movie?.director)
    }

    @Test
    fun getTvShow() {
        val tvShow = viewModel.getTvShow()
        assertNotNull(tvShow)
        assertEquals(refTvShow.imagePath, tvShow?.imagePath)
        assertEquals(refTvShow.name, tvShow?.name)
        assertEquals(refTvShow.description, tvShow?.description)
        assertEquals(refTvShow.startDate, tvShow?.startDate)
        assertEquals(refTvShow.rating, tvShow?.rating)
        assertEquals(refTvShow.ratingCount, tvShow?.ratingCount)
        assertEquals(refTvShow.genres, tvShow?.genres)
    }
}