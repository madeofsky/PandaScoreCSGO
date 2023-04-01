package com.madeofsky.pandascorecsgo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.madeofsky.pandascorecsgo.databinding.ActivityPandaScoreMainBinding
import com.madeofsky.pandascorecsgo.matches.ui.PandaScoreMatchesFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PandaScoreMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPandaScoreMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPandaScoreMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_panda_score_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PandaScoreMatchesFragment())
                .commitNow()
        }
    }
}