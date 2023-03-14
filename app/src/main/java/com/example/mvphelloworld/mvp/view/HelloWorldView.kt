package com.example.mvphelloworld.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.mvphelloworld.mvp.contract.HelloWorldContract
import com.example.mvphelloworld.mvp.view.base.ActivityView

class HelloWorldView(activity: Activity) : ActivityView(activity), HelloWorldContract.View {

    override fun showText(text: String) {
        Toast.makeText(activity, text, Toast.LENGTH_SHORT).show()
    }
}
