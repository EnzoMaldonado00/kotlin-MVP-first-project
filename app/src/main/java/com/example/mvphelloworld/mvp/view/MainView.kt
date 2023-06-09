package com.example.mvphelloworld.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.mvp_pil_hello_world.databinding.ActivityMainBinding
import com.example.mvphelloworld.mvp.contract.MainContract
import com.example.mvphelloworld.mvp.view.base.ActivityView

class MainView(activity: Activity) : ActivityView(activity), MainContract.View {

    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun showText(text: String) {
        Toast.makeText(activity, text, Toast.LENGTH_SHORT).show()
    }

    override fun onButtonPressed(onClick: () -> Unit) {
        binding.btnShowText.setOnClickListener { onClick() }
    }

    override fun getText(): String {
        return binding.editText.text.toString()
    }
}
