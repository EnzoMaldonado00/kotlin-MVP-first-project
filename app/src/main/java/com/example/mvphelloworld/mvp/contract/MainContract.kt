package com.example.mvphelloworld.mvp.contract

interface MainContract {
    interface Presenter {
        fun onButtonPressed()
    }
    interface View {
        fun showText()
        fun getText(): String
    }
}
