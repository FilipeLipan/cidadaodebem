package com.cwb.androiddevbr.cidadaodebem.ui.main


import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.cwb.androiddevbr.cidadaodebem.R
import com.cwb.androiddevbr.cidadaodebem.ui.base.BaseActivity
import com.google.android.material.bottomappbar.BottomAppBar
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {

    override val viewModel: LoginViewModel by viewModel()
    override val activityLayout = R.layout.activity_main


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setSupportActionBar(bar)
        bar.hideOnScroll = true

        teste.setOnClickListener {
            if(bar.fabAlignmentMode == BottomAppBar.FAB_ALIGNMENT_MODE_CENTER){
                bar.fabAlignmentMode = BottomAppBar.FAB_ALIGNMENT_MODE_END
            }else{
                bar.fabAlignmentMode = BottomAppBar.FAB_ALIGNMENT_MODE_CENTER
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_primary, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.app_bar_group -> {
                startActivity(LoginActivity.getIntent(this))
                return true
            }
            R.id.app_bar_create -> {
                startActivity(LoginActivity.getIntent(this))
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
