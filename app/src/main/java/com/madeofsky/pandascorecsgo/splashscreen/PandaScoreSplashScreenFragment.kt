package com.madeofsky.pandascorecsgo.splashscreen

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.madeofsky.pandascorecsgo.databinding.FragmentPandaScoreSplashScreenBinding
import dagger.hilt.android.AndroidEntryPoint

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class PandaScoreSplashScreenFragment : Fragment() {

    private lateinit var binding: FragmentPandaScoreSplashScreenBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentPandaScoreSplashScreenBinding.inflate(layoutInflater)
        return binding.root
    }
}