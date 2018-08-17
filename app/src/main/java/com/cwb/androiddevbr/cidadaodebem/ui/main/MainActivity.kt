package com.cwb.androiddevbr.cidadaodebem.ui.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.cwb.androiddevbr.cidadaodebem.R
import com.cwb.androiddevbr.cidadaodebem.models.Group
import com.cwb.androiddevbr.cidadaodebem.ui.base.BaseFragmentActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : BaseFragmentActivity() {

    override val container: FrameLayout
        get() = fragment_container
    override val toolbar: Toolbar
        get() = bar

    override val viewModel: MainViewModel by viewModel()
    override val activityLayout = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bar.hideOnScroll = true


        viewModel.groupsLiveData.observe(this, Observer {
            groups_recyclerview.layoutManager = LinearLayoutManager(this)
            val groups = it.toObjects(Group::class.java)
            groups_recyclerview.adapter = GroupAdapter(this, groups)
        })

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
