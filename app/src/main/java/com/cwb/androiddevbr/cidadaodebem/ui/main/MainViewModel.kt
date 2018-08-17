package com.cwb.androiddevbr.cidadaodebem.ui.main

import com.cwb.androiddevbr.cidadaodebem.data.FirebaseQueryLiveData
import com.cwb.androiddevbr.cidadaodebem.ui.base.BaseViewModel
import com.google.firebase.firestore.FirebaseFirestore
import com.cwb.androiddevbr.cidadaodebem.models.Group


class MainViewModel :BaseViewModel(){

    private val DATABASE_REF = FirebaseFirestore.getInstance().collection(Group.FIREBASE_COLLECTION_NAME)

    val groupsLiveData = FirebaseQueryLiveData(DATABASE_REF)

}