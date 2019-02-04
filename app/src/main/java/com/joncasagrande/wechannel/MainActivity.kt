package com.joncasagrande.wechannel

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.joncasagrande.wechannel.model.Player1
import com.joncasagrande.wechannel.model.Player2
import com.joncasagrande.wechannel.recyclerView.ChannelRecyclerView
import com.joncasagrande.wechannel.util.channel1
import com.joncasagrande.wechannel.util.channel2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var channelRecyclerViewAdapter : ChannelRecyclerView
    val mainActivityViewModel :MainActivityViewModel = MainActivityViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        channelRecyclerViewAdapter = ChannelRecyclerView(this, arrayListOf(Player1(channel1,"Channel 1",R.drawable.channel1), Player2(channel2,"Channel 2",R.drawable.channel2)))

        val channelLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        RVchannel.layoutManager = channelLayout
        RVchannel.adapter = channelRecyclerViewAdapter

    }
}
