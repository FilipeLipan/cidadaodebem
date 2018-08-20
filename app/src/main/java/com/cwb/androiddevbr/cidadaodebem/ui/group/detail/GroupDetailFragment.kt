package com.cwb.androiddevbr.cidadaodebem.ui.group.detail

import android.os.Bundle
import android.view.View
import com.cwb.androiddevbr.cidadaodebem.R
import com.cwb.androiddevbr.cidadaodebem.ui.base.BaseFragment
import com.cwb.androiddevbr.cidadaodebem.ui.group.GroupListViewModel


class GroupDetailFragment : BaseFragment() {

    override val viewModel: GroupListViewModel
        get() = GroupListViewModel()

    override val fragmentLayout: Int
        get() = R.layout.fragment_group_detail

    override val fragmentTag: String
        get() = "GroupDetailFragment"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}