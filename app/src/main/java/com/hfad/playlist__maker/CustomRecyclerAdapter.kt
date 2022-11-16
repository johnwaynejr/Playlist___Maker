package com.hfad.playlist___maker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

class CustomRecyclerAdapter(private val trackList: ArrayList<Track>) : RecyclerView
.Adapter<CustomRecyclerAdapter.MyViewHolder>() {



    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val trackTextView: TextView = itemView.findViewById(R.id.trackName)
        val artistTextView: TextView = itemView.findViewById(R.id.trackArtist)
        val image:ImageView = itemView.findViewById(R.id.artistCover)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.track_list_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dot = "·"
        holder.trackTextView.text = trackList.get(0).trackName
        holder.artistTextView.text = "${trackList.get(0).artistName} $dot ${trackList.get(0).trackTime}"
        val imageUrl =trackList.get(0).artworkUrl100
        Glide.with(holder.itemView.context)
            .load(imageUrl)
            .placeholder(R.drawable.ic_arrow_back)
            .centerInside()
            .transform(RoundedCorners(10))
            .into(holder.image)
    }

    override fun getItemCount() = trackList.size
}