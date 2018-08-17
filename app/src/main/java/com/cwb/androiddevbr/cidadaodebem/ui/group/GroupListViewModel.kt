package com.cwb.androiddevbr.cidadaodebem.ui.group

import com.cwb.androiddevbr.cidadaodebem.data.FirebaseQueryLiveData
import com.cwb.androiddevbr.cidadaodebem.models.Group
import com.cwb.androiddevbr.cidadaodebem.ui.base.BaseViewModel
import com.google.firebase.firestore.FirebaseFirestore

class GroupListViewModel : BaseViewModel() {


    private val DATABASE_REF = FirebaseFirestore.getInstance().collection(Group.FIREBASE_COLLECTION_NAME)

    val groupsLiveData = FirebaseQueryLiveData(DATABASE_REF)

}