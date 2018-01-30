package com.mwidlok.cleancodesample.MainConfigurator

import com.mwidlok.cleancodesample.MainActivity
import com.mwidlok.cleancodesample.MainInteractor.MainInteractor
import com.mwidlok.cleancodesample.MainPresenter.MainPresenter
import java.lang.ref.WeakReference

/**
 * Initialises all parts of clean code.
 */

class MainConfigurator {
    companion object {
        fun configure(activity: MainActivity) {
            val presenter = MainPresenter()
            presenter.output = WeakReference(activity)

            val interactor = MainInteractor()
            interactor.output = presenter

            activity.output = activity.output ?: interactor
        }
    }
}