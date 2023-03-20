package com.example.mvphelloworld.mvp.presenter

import com.example.mvphelloworld.mvp.contract.MainContract

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {

    init {
        view.onButtonPressed { onButtonPressed(view.getText()) }
    }
    override fun onButtonPressed(text: String) {
        view.showText(text)
    }
}
