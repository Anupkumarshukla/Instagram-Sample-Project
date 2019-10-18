package com.android.anupkumar.instagram.di.component

import com.android.anupkumar.instagram.di.ActivityScope
import com.android.anupkumar.instagram.di.module.ActivityModule
import com.android.anupkumar.instagram.ui.dummy.DummyActivity
import com.android.anupkumar.instagram.ui.login.LoginActivity
import com.android.anupkumar.instagram.ui.main.MainActivity
import com.android.anupkumar.instagram.ui.splash.SplashActivity
import dagger.Component

@ActivityScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [ActivityModule::class]
)
interface ActivityComponent {

    fun inject(activity: SplashActivity)

    fun inject(activity: LoginActivity)

    fun inject(activity: DummyActivity)

    fun inject(activity: MainActivity)
}