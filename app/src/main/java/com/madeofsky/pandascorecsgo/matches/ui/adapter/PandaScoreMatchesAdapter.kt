package com.madeofsky.pandascorecsgo.matches.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.madeofsky.pandascorecsgo.databinding.MatchItemBinding
import com.madeofsky.pandascorecsgo.matches.data.PandaScoreMatchInfo
import com.madeofsky.pandascorecsgo.matches.ui.viewholder.PandaScoreMatchesViewHolder

class PandaScoreMatchesAdapter(
    private val matches: List<PandaScoreMatchInfo>,
    private val listener: PandaScoreMatchesViewHolder.OnRepositoryClickListener
) : RecyclerView.Adapter<PandaScoreMatchesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PandaScoreMatchesViewHolder {
        val binding = MatchItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PandaScoreMatchesViewHolder(binding, listener)
    }

    override fun onBindViewHolder(holder: PandaScoreMatchesViewHolder, position: Int) {
        val repositories = matches[position]
        holder.bind(repositories, position)
    }

    override fun getItemCount(): Int = matches.size
}