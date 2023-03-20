package com.example.mvphelloworld.mvp.contract

interface MainContract {
    interface Presenter {
        fun onButtonPressed(text: String)
    }
    interface View {
        fun showText(text: String)
        fun onButtonPressed(onClick: () -> Unit)
        fun getText(): String
    }
}
