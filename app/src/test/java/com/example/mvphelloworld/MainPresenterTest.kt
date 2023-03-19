package com.example.mvphelloworld

import com.example.mvphelloworld.mvp.contract.MainContract
import com.example.mvphelloworld.mvp.presenter.MainPresenter
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MainPresenterTest {
    private lateinit var mainPresenter: MainContract.Presenter

    @RelaxedMockK
    private lateinit var mainView: MainContract.View

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        mainPresenter = MainPresenter(mainView)
    }

    @Test
    fun aToastShouldBeDisplayed() {
        every { mainView.getText() } returns "Hello"
        mainPresenter.onButtonPressed()
        verify { mainView.showText() }
    }
}
