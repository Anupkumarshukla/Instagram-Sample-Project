package com.android.anupkumar.instagram.di.module

import androidx.lifecycle.LifecycleRegistry
import com.android.anupkumar.instagram.di.ViewModelScope
import com.android.anupkumar.instagram.ui.base.BaseItemViewHolder
import dagger.Module
import dagger.Provides

@Module
class ViewHolderModule(private val viewHolder: BaseItemViewHolder<*, *>) {

    @Provides
    @ViewModelScope
    fun provideLifecycleRegistry(): LifecycleRegistry = LifecycleRegistry(viewHolder)
}