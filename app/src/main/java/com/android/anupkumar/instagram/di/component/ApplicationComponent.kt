package com.android.anupkumar.instagram.di.component

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.android.anupkumar.instagram.InstagramApplication
import com.android.anupkumar.instagram.data.local.db.DatabaseService
import com.android.anupkumar.instagram.data.remote.NetworkService
import com.android.anupkumar.instagram.data.repository.UserRepository
import com.android.anupkumar.instagram.di.ApplicationContext
import com.android.anupkumar.instagram.di.TempDirectory
import com.android.anupkumar.instagram.di.module.ApplicationModule
import com.android.anupkumar.instagram.utils.network.NetworkHelper
import com.android.anupkumar.instagram.utils.rx.SchedulerProvider
import dagger.Component
import io.reactivex.disposables.CompositeDisposable
import java.io.File
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(app: InstagramApplication)

    fun getApplication(): Application

    @ApplicationContext
    fun getContext(): Context


    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

    fun getSharedPreferences(): SharedPreferences

    fun getNetworkHelper(): NetworkHelper

    fun getUserRepository(): UserRepository

    fun getSchedulerProvider(): SchedulerProvider

    fun getCompositeDisposable(): CompositeDisposable

    @TempDirectory
    fun getTempDirectory(): File
}