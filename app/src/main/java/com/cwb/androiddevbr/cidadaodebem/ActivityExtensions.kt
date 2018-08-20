package com.cwb.androiddevbr.cidadaodebem

import android.app.Activity
import android.view.View
import androidx.fragment.app.FragmentActivity

public fun Activity.inflateView(view: Int): View {
    return this.layoutInflater.inflate(view, this.findViewById(android.R.id.content), false)
}

public fun FragmentActivity.inflateView(view: Int): View {
    return this.layoutInflater.inflate(view, this.findViewById(android.R.id.content), false)
}
