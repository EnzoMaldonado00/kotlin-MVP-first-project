package com.example.mvphelloworld.mvp.presenter

import com.example.mvphelloworld.mvp.contract.HelloWorldContract

class HelloWorldPresenter(private val model: HelloWorldContract.Model, private val view: HelloWorldContract.View) : HelloWorldContract.Presenter {
    override fun onShowTextButtonPressed(text: String) {
        view.showText(model.getText(text))
    }
}
