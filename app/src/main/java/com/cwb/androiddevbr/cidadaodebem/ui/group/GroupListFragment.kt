package com.cwb.androiddevbr.cidadaodebem.ui.group

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.cwb.androiddevbr.cidadaodebem.R
import com.cwb.androiddevbr.cidadaodebem.models.Group
import com.cwb.androiddevbr.cidadaodebem.ui.base.BaseFragment
import com.cwb.androiddevbr.cidadaodebem.ui.main.GroupAdapter
import kotlinx.android.synthetic.main.activity_main.*

class GroupListFragment : BaseFragment() {

    override val viewModel: GroupListViewModel
        get() = GroupListViewModel()

    override val fragmentLayout: Int
        get() = R.layout.fragment_group_list

    override val fragmentTag: String
        get() = "GroupListFragment"

    val groupAdapter :GroupAdapter by lazy {
        GroupAdapter(context!!, mutableListOf())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()

        viewModel.groupsLiveData.observe(this, Observer {
            //TODO create empty list layout
            val groups = it.toObjects(Group::class.java)
            groupAdapter.setNewData(groups)
        })
    }

    private fun initAdapter(){
        groups_recyclerview.layoutManager = LinearLayoutManager(context!!)
        groups_recyclerview.adapter = groupAdapter
        //TODO create loading layout
    }
}
