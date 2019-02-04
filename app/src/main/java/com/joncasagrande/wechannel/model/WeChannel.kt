package com.joncasagrande.wechannel.model

import android.view.View


interface WeChannel{
    fun playChannel() : View
    fun getChannelDisplay(): Int
}