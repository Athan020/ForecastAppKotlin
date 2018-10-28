package com.athandile.forecastapp.weather.future.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.athandile.forecastapp.R

class FutureDetailFragment : Fragment() {

    companion object {
        fun newInstance() = FutureDetailFragment()
    }

    private lateinit var viewModel: FutureDetailViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.future_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FutureDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
