package com.mwidlok.cleancodesample.MainInteractor

import android.util.Log
import com.mwidlok.cleancodesample.MainPresenter.IMainPresenter

/**
 * This class offers some convenience methods for showing custom alert dialog with different user options.
 */

interface IMainInteractor {
    fun fetchApiData()
}

class MainInteractor : IMainInteractor {
    var output: IMainPresenter? = null


    override fun fetchApiData() {
        var apiString = "myapistring"
        Log.i("CleanCode","Hello from Interactor!")

        // no real api is here. not important for sample
        // we suggest we got an api string with value "myapistring"
        output?.presentData(apiString)
    }
}