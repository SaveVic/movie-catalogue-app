package com.example.moviecatalogueapp.ui.main.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviecatalogueapp.data.model.Movie
import com.example.moviecatalogueapp.databinding.FragmentMovieBinding
import com.example.moviecatalogueapp.ui.main.adapter.MoviesAdapter
import com.example.moviecatalogueapp.ui.main.viewmodel.MainViewModel

class MovieFragment : Fragment() {
    private var binding: FragmentMovieBinding? = null
    private var adapter: MoviesAdapter? = null
    private var viewModel: MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupViewModel()
    }

    private fun setupViewModel() {
        viewModel = activity?.let{
            ViewModelProvider(
                it,
                ViewModelProvider.NewInstanceFactory()
            )[MainViewModel::class.java]
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMovieBinding.inflate(inflater, container, false)
        setupUI()
//        setupObserver()
        return binding?.root
    }

    private fun setupUI() {
        binding?.movieRv?.layoutManager =
            LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        adapter = MoviesAdapter(viewModel?.getMovies() ?: listOf())
        binding?.movieRv?.adapter = adapter
        adapter?.setOnItemClickCallback(object: MoviesAdapter.OnItemClickCallback{
            override fun onItemClicked(movie: Movie) {
                navigateDetail(movie)
            }
        })
    }

    private fun navigateDetail(movie: Movie){
        val intent = Intent(context, DetailMovieActivity::class.java)
        intent.putExtra(DetailMovieActivity.DATA, movie.title)
        startActivity(intent)
    }

//    private fun renderList(movies: List<Movie>) {
//        adapter?.replaceList(movies)
//        adapter?.notifyDataSetChanged()
//    }
//
//    private fun setupObserver() {
//        viewModel?.getMovies()?.observe(viewLifecycleOwner, {
//            renderList(it)
//        })
//    }
}