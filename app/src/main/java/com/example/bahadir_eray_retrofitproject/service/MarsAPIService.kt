package com.example.bahadir_eray_retrofitproject.service

import com.example.bahadir_eray_retrofitproject.model.MarsModel
import com.google.gson.Gson
import io.reactivex.Single
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MarsAPIService {

    // GET, POST, UPDATE, DELETE
    // Base Url: https://mars.udacity.com/
    // GET: realestate
    private val BASE_URL = "https://mars.udacity.com/"
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(MarsAPI::class.java)

    fun getMars(): Call<List<MarsModel>> {
        return api.getData()

    }
}