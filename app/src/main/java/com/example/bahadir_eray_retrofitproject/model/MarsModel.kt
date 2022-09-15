package com.example.bahadir_eray_retrofitproject.model

import com.google.gson.annotations.SerializedName

data class MarsModel(
    @SerializedName("price")
    val price: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("type")
    val type: String,
    @SerializedName("img_src")
    val img_src: String
)