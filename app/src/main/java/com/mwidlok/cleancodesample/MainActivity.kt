package com.mwidlok.cleancodesample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mwidlok.cleancodesample.MainInteractor.MainInteractor
import kotlinx.android.synthetic.main.activity_main.*


interface MainActivityInput {

    fun displayValue(message:String)
}

class MainActivity : AppCompatActivity(), MainActivityInput {

    protected var mainInteractor: MainInteractor? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainInteractor?.fetchApiData()

    }

     override fun displayValue(message: String) {
        tvOutput.text = message
    }
}
