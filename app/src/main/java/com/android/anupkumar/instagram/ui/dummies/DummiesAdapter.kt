package com.android.anupkumar.instagram.ui.dummies

import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import com.android.anupkumar.instagram.data.model.Dummy
import com.android.anupkumar.instagram.ui.base.BaseAdapter

class DummiesAdapter(
    parentLifecycle: Lifecycle,
    private val dummies: ArrayList<Dummy>
) : BaseAdapter<Dummy, DummyItemViewHolder>(parentLifecycle, dummies) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DummyItemViewHolder(parent)
}