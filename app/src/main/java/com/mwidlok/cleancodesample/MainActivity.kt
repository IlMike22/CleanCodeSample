package com.mwidlok.cleancodesample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mwidlok.cleancodesample.MainConfigurator.MainConfigurator
import com.mwidlok.cleancodesample.MainInteractor.MainInteractor
import kotlinx.android.synthetic.main.activity_main.*


interface MainActivityInput {

    fun displayValue(message:String)
}

class MainActivity : AppCompatActivity(), MainActivityInput {

    var output: MainInteractor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // call configurator to initialise all parts of cc
        MainConfigurator.configure(this)

        btnClickMe.setOnClickListener {
            Log.i("CleanCode","Hello from Activity!")
            output?.fetchApiData()

        }
    }

     override fun displayValue(message: String) {
         Log.i("CleanCode","Hello from Activity again!")
         tvOutput.text = message
    }
}
