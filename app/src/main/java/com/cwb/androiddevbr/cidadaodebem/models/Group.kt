package com.cwb.androiddevbr.cidadaodebem.models

class Group() {
    companion object {
        public val FIREBASE_COLLECTION_NAME = "groups"
    }

    public var name :String = ""
    public var description :String = ""
    public var banner :String = ""
}