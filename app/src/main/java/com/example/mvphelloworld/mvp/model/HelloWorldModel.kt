package com.example.mvphelloworld.mvp.model

import com.example.mvphelloworld.mvp.contract.HelloWorldContract

class HelloWorldModel : HelloWorldContract.Model {
    override fun getText(text: String): String = text
}
