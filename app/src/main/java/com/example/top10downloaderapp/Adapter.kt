package com.example.top10downloaderapp

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.top10downloaderapp.databinding.ItemRowBinding

class Adapter(val list: List<Top10>?) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(val binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        return ViewHolder(
            ItemRowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val item = list!![position]

        holder.binding.apply {
            tvTop10.text = item.name
        }
    }

    override fun getItemCount(): Int = list!!.size

}