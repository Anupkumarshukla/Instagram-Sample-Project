package com.android.anupkumar.instagram.di.component

import com.android.anupkumar.instagram.di.ViewModelScope
import com.android.anupkumar.instagram.di.module.ViewHolderModule
import com.android.anupkumar.instagram.ui.dummies.DummyItemViewHolder
import com.android.anupkumar.instagram.ui.home.posts.PostItemViewHolder
import dagger.Component

@ViewModelScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [ViewHolderModule::class]
)
interface ViewHolderComponent {

    fun inject(viewHolder: DummyItemViewHolder)

    fun inject(viewHolder: PostItemViewHolder)
}