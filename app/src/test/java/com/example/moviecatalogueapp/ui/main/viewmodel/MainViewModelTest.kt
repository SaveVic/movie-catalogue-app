package com.example.moviecatalogueapp.ui.main.viewmodel

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class MainViewModelTest {

    private lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun getMovies() {
        val data = viewModel.getMovies()
        assertNotNull(data)
//        assertNotNull(data.value)
        assertEquals(10, data.size)
    }

    @Test
    fun getTvShows() {
        val data = viewModel.getTvShows()
        assertNotNull(data)
//        assertNotNull(data.value)
        assertEquals(10, data.size)
    }
}