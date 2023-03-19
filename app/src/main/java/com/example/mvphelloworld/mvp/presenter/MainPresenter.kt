package com.example.mvphelloworld.mvp.presenter

import com.example.mvphelloworld.mvp.contract.MainContract

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {

    init {
        onButtonPressed()
    }

    override fun onButtonPressed() {
        view.showText()
    }
}
