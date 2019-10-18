package com.android.anupkumar.instagram.ui.dummy

import android.os.Bundle
import com.android.anupkumar.instagram.R
import com.android.anupkumar.instagram.di.component.ActivityComponent
import com.android.anupkumar.instagram.ui.base.BaseActivity
import com.android.anupkumar.instagram.ui.dummies.DummiesFragment

class DummyActivity : BaseActivity<DummyViewModel>() {

    companion object {
        const val TAG = "DummyActivity"
    }

    override fun provideLayoutId(): Int = R.layout.activity_dummy

    override fun injectDependencies(activityComponent: ActivityComponent) {
        activityComponent.inject(this)
    }

    override fun setupView(savedInstanceState: Bundle?) {
        addDummiesFragment()
    }

    private fun addDummiesFragment() {
        supportFragmentManager.findFragmentByTag(DummiesFragment.TAG) ?: supportFragmentManager
            .beginTransaction()
            .add(R.id.container_fragment, DummiesFragment.newInstance(), DummiesFragment.TAG)
            .commitAllowingStateLoss()
    }
}