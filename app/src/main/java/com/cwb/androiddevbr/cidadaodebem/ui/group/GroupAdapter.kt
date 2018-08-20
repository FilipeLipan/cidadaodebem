package com.cwb.androiddevbr.cidadaodebem.ui.group

import android.content.Context
import android.view.View
import android.widget.ImageView

import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.cwb.androiddevbr.cidadaodebem.R
import com.cwb.androiddevbr.cidadaodebem.models.Group

class GroupAdapter(private val context: Context, data: List<Group>?) : BaseQuickAdapter<Group, BaseViewHolder>(R.layout.item_groups, data) {

    override fun convert(helper: BaseViewHolder, news: Group) {
        Glide.with(context)
                .load(news.banner)
                .thumbnail(Glide.with(context)
                        .load(R.drawable.news_placeholder))
                .into(helper.getView<View>(R.id.news_banner_imageview) as ImageView)

        helper.setText(R.id.news_title_textview, news.name)
    }
}
