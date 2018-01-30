package com.mwidlok.cleancodesample.MainInteractor

import com.mwidlok.cleancodesample.MainPresenter.MainPresenter

/**
 * This class offers some convenience methods for showing custom alert dialog with different user options.
 */

interface IMainInteractor
{
    fun fetchApiData()
}

class MainInteractor : IMainInteractor
{
    protected var mainPresenter: MainPresenter? = null

    override fun fetchApiData() {
        var apiString = "myapistring"
        // no real api is here. not important for sample
        // we suggest we got an api string with value "myapistring"
        mainPresenter?.presentData(apiString)
    }
}