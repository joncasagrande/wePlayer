package com.joncasagrande.wechannel

import android.view.View

class MainActivityPresenter(val presenter: Presenter){
    interface Presenter{
        fun playChannel() : View
    }




}