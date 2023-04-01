package com.madeofsky.pandascorecsgo.matchdetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.madeofsky.pandascorecsgo.R
import com.madeofsky.pandascorecsgo.databinding.FragmentPandaScoreMatchDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PandaScoreMatchDetailsFragment : Fragment() {

    private lateinit var binding: FragmentPandaScoreMatchDetailsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentPandaScoreMatchDetailsBinding.inflate(layoutInflater)
        return binding.root
    }
}