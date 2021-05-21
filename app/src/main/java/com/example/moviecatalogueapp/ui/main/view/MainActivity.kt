package com.example.moviecatalogueapp.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.moviecatalogueapp.R
import com.example.moviecatalogueapp.databinding.ActivityMainBinding
import com.example.moviecatalogueapp.ui.main.adapter.MainPagerAdapter
import com.example.moviecatalogueapp.ui.main.viewmodel.MainViewModel
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    companion object {
        private val TAB = intArrayOf(
            R.string.tabs_movie,
            R.string.tabs_tv_show,
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViewModel()
        setupUI()
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(
            this@MainActivity,
            ViewModelProvider.NewInstanceFactory()
        )[MainViewModel::class.java]
    }

    private fun setupUI() {
        val pagerAdapter = MainPagerAdapter(this)
        binding.mainPager.adapter = pagerAdapter
        TabLayoutMediator(binding.mainTabs, binding.mainPager) { tab, i ->
            tab.text = resources.getString(TAB[i])
        }.attach()
    }
}