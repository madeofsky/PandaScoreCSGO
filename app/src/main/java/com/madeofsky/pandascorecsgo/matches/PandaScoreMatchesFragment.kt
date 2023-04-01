package com.madeofsky.pandascorecsgo.matches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.madeofsky.pandascorecsgo.databinding.FragmentPandaScoreMatchesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PandaScoreMatchesFragment : Fragment() {

    private lateinit var binding: FragmentPandaScoreMatchesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentPandaScoreMatchesBinding.inflate(layoutInflater)
        return binding.root
    }
}