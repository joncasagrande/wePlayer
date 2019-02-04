package com.joncasagrande.wechannel.strategy

import com.joncasagrande.wechannel.model.Player1
import com.joncasagrande.wechannel.model.Player2
import com.joncasagrande.wechannel.model.WeChannel
import com.joncasagrande.wechannel.util.channel1
import com.joncasagrande.wechannel.util.channel2

class WeChannelStrategy {

    fun createPlayer(channelId: String): WeChannel{
        when(channelId){
            channel1 -> return Player1("","","")
            channel2 -> return Player2("","","")
            else -> {
                return Player1("","","")
            }
        }
    }
}