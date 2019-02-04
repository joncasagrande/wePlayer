package com.joncasagrande.wechannel.factoryMethod

import android.view.View
import com.joncasagrande.wechannel.strategy.WeChannelStrategy
import com.joncasagrande.wechannel.model.WeChannel

class PlayerFactoryMethod{

    fun play(channelId: String): View? {
        val weChannel: WeChannel = WeChannelStrategy().createPlayer(channelId)

        return weChannel.playChannel()
    }
}