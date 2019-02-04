package com.joncasagrande.wechannel.recyclerView

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.joncasagrande.wechannel.R
import com.joncasagrande.wechannel.model.WeChannel
import kotlinx.android.synthetic.main.channel_list_item.view.*

class ChannelRecyclerView(val context: Context, val items : List<out WeChannel>) : RecyclerView.Adapter<ChannelRecyclerView.ChannelViewHolder>() {

    class ChannelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(weChannel: WeChannel) = with(itemView){
            Glide.with(itemView).load(weChannel.getChannelDisplay()).into(itemView.IVchannel)
            setOnClickListener {

            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ChannelViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.channel_list_item, parent, false)
        return ChannelViewHolder(v)

    }

    override fun onBindViewHolder(holder: ChannelViewHolder, position: Int)= holder.bind(items[position])

    override fun getItemCount(): Int = items.size

}

