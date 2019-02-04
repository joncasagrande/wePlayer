package com.joncasagrande.wechannel

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.joncasagrande.wechannel.model.Player1
import com.joncasagrande.wechannel.model.Player2
import com.joncasagrande.wechannel.model.WeChannel
import com.joncasagrande.wechannel.recyclerView.ChannelRecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var channelRecyclerViewAdapter : ChannelRecyclerView
    val mainActivityViewModel :MainActivityViewModel = MainActivityViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        channelRecyclerViewAdapter = ChannelRecyclerView(this, arrayListOf(Player1("","",""), Player2("","","")))

        val channelLayout = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        RVchannel.layoutManager = channelLayout
        RVchannel.adapter = channelRecyclerViewAdapter



    }
}
