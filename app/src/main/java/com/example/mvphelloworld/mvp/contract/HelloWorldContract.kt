package com.example.mvphelloworld.mvp.contract

interface HelloWorldContract {
    interface Model {
        fun getText(text: String): String
    }

    interface View {
        fun showText(text: String)
    }

    interface Presenter {
        fun onShowTextButtonPressed(text: String)
    }
}
