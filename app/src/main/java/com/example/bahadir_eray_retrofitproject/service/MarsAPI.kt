package com.example.bahadir_eray_retrofitproject.service

import com.example.bahadir_eray_retrofitproject.model.MarsModel
import retrofit2.Call
import retrofit2.http.GET

interface MarsAPI {
    // GET, POST, UPDATE, DELETE
    // Base Url: https://mars.udacity.com/
    // GET: realestate
    @GET("realestate")
    fun getData(): Call<List<MarsModel>>

}