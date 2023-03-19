package com.example.mvphelloworld.activity // ktlint-disable package-name

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvphelloworld.mvp.presenter.MainPresenter
import com.example.mvphelloworld.mvp.view.MainView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainPresenter(MainView(this))
    }
}
