package com.android.anupkumar.instagram.di.component

import com.android.anupkumar.instagram.di.FragmentScope
import com.android.anupkumar.instagram.di.module.FragmentModule
import com.android.anupkumar.instagram.ui.dummies.DummiesFragment
import com.android.anupkumar.instagram.ui.home.HomeFragment
import com.android.anupkumar.instagram.ui.photo.PhotoFragment
import com.android.anupkumar.instagram.ui.profile.ProfileFragment
import dagger.Component

@FragmentScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [FragmentModule::class]
)
interface FragmentComponent {

    fun inject(fragment: DummiesFragment)

    fun inject(fragment: ProfileFragment)

    fun inject(fragment: PhotoFragment)

    fun inject(fragment: HomeFragment)
}