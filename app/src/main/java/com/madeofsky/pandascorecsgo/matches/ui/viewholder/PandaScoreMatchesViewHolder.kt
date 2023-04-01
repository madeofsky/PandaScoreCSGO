package com.madeofsky.pandascorecsgo.matches.ui.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.madeofsky.pandascorecsgo.databinding.MatchItemBinding
import com.madeofsky.pandascorecsgo.matches.data.PandaScoreMatchInfo

class PandaScoreMatchesViewHolder(
    private val binding: MatchItemBinding,
    private val listener: OnRepositoryClickListener
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(matchInfo: PandaScoreMatchInfo, position: Int) {
        itemView.apply {
            binding.apply {
            }

            this.setOnClickListener {
                listener.onRepositoryCardClick(matchInfo, position)
            }

//            Glide.with(context)
//                .load("${matchInfo.owner?.avatar_url}")
//                .dontAnimate()
//                .into(binding.avatarLayout.imageViewAvatar)
        }
    }


    interface OnRepositoryClickListener {
        fun onRepositoryCardClick(matchInfo: PandaScoreMatchInfo, itemPosition: Int)
    }
}