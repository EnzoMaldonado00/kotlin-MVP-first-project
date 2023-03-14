package com.example.mvphelloworld.activity // ktlint-disable package-name

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvp_pil_hello_world.R
import com.example.mvp_pil_hello_world.databinding.ActivityMainBinding
import com.example.mvphelloworld.mvp.model.HelloWorldModel
import com.example.mvphelloworld.mvp.presenter.HelloWorldPresenter
import com.example.mvphelloworld.mvp.view.HelloWorldView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowText.setOnClickListener {
            HelloWorldPresenter(HelloWorldModel(), HelloWorldView(this)).onShowTextButtonPressed(binding.editText.text.toString())
        }
    }
}
