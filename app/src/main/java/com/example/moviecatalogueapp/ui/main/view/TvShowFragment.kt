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
import com.example.moviecatalogueapp.data.model.TvShow
import com.example.moviecatalogueapp.databinding.FragmentTvShowBinding
import com.example.moviecatalogueapp.ui.main.adapter.TvShowsAdapter
import com.example.moviecatalogueapp.ui.main.viewmodel.MainViewModel

class TvShowFragment : Fragment() {
    private var binding: FragmentTvShowBinding? = null
    private var adapter: TvShowsAdapter? = null
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
        binding = FragmentTvShowBinding.inflate(inflater, container, false)
        setupUI()
//        setupObserver()
        return binding?.root
    }

    private fun setupUI() {
        binding?.tvShowRv?.layoutManager =
            LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        adapter = TvShowsAdapter(viewModel?.getTvShows() ?: listOf())
        binding?.tvShowRv?.adapter = adapter
        adapter?.setOnItemClickCallback(object: TvShowsAdapter.OnItemClickCallback{
            override fun onItemClicked(tvShow: TvShow) {
                navigateDetail(tvShow)
            }
        })
    }

    private fun navigateDetail(tvShow: TvShow){
        val intent = Intent(context, DetailTvShowActivity::class.java)
        intent.putExtra(DetailTvShowActivity.DATA, tvShow.name)
        startActivity(intent)
    }

//    private fun renderList(tvShows: List<TvShow>) {
//        adapter?.replaceList(tvShows)
//        adapter?.notifyDataSetChanged()
//    }
//
//    private fun setupObserver() {
//        viewModel?.getTvShows()?.observe(viewLifecycleOwner, {
//            renderList(it)
//        })
//    }
}