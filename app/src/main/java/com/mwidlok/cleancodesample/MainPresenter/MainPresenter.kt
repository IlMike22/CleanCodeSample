package com.mwidlok.cleancodesample.MainPresenter

import com.mwidlok.cleancodesample.MainActivityInput
import java.lang.ref.WeakReference

/**
 * This class offers some convenience methods for showing custom alert dialog with different user options.
 */

interface IMainPresenter
{
    fun presentData(message:String)
}

class MainPresenter : IMainPresenter
{
    var output: WeakReference<MainActivityInput>? = null

    override fun presentData(message:String) {

        var formattedString = "Formatted string: $message"
        output?.get()?.displayValue(formattedString)

    }
}