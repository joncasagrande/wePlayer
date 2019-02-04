package com.joncasagrande.wechannel.model

import android.view.View

class Player2(val id:String, val name: String,val  thumbnail: Int) : WeChannel{

    override fun getChannelDisplay(): Int {
        return thumbnail
    }

    override fun playChannel(): View? {
        return null

    }

}