package com.cwb.androiddevbr.cidadaodebem.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.cwb.androiddevbr.cidadaodebem.R
import com.cwb.androiddevbr.cidadaodebem.ui.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.google.firebase.auth.FirebaseAuth


class LoginActivity : BaseActivity() {

    override val viewModel: LoginViewModel by viewModel()
    override val activityLayout = R.layout.activity_login

    private val mAuth: FirebaseAuth = FirebaseAuth.getInstance()

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, LoginActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
}
