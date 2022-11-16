package com.hfad.playlist___maker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomRecyclerAdapter(private val trackList: ArrayList<Track>) : RecyclerView
.Adapter<CustomRecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val trackTextView: TextView = itemView.findViewById(R.id.trackName)
        val artistTextView: TextView = itemView.findViewById(R.id.trackArtist)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.track_list_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.trackTextView.text = trackList.get(0).trackName
        holder.artistTextView.text = "${trackList.get(0).artistName} * ${trackList.get(0).trackTime}"
    }

    override fun getItemCount() = trackList.size
}