package com.madeofsky.pandascorecsgo.matches.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.madeofsky.pandascorecsgo.databinding.FragmentPandaScoreMatchesBinding
import com.madeofsky.pandascorecsgo.matches.ui.adapter.PandaScoreMatchesAdapter
import com.madeofsky.pandascorecsgo.matches.ui.viewholder.PandaScoreMatchesViewHolder
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PandaScoreMatchesFragment : Fragment() {

    private lateinit var binding: FragmentPandaScoreMatchesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentPandaScoreMatchesBinding.inflate(layoutInflater)
        return binding.root
    }

//    private fun initAdapter(repositories: List<MatchInfo>) {
//        val repositoriesListAdapter = PandaScoreMatchesAdapter(repositories, object : PandaScoreMatchesViewHolder.OnRepositoryClickListener {
//            override fun onRepositoryCardClick(matchInfo: MatchInfo, itemPosition: Int) {
//                viewModel.onRepositoryClick(repositoryInfo)
//            }
//        })
//
//        val linearLayoutManager = LinearLayoutManager(requireContext())
//        linearLayoutManager.orientation = RecyclerView.VERTICAL
//
//        binding.loadingLottieAnimation.apply {
//            this.cancelAnimation()
//            this.visibility = View.GONE
//        }
//
//        binding.repositoriesRecyclerView.apply {
//            this.visibility = View.VISIBLE
//            this.layoutManager = linearLayoutManager
//            this.adapter = repositoriesListAdapter
//        }
//    }
}