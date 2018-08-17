package com.cwb.androiddevbr.cidadaodebem.ui.base

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentTransaction

abstract class BaseFragmentActivity: BaseActivity(){

    abstract val toolbar : Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(toolbar)
    }

    private val fragmentTransaction : FragmentTransaction
        get() = supportFragmentManager.beginTransaction()

    fun setTitle(title: String) {
        supportActionBar?.title = title
    }

    fun setDisplayHomeAsUpEnabled() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}