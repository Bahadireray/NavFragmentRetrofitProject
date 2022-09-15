package com.example.bahadir_eray_retrofitproject.service

import com.example.bahadir_eray_retrofitproject.model.MarsModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MarsAPIService {

    /* GET, POST, UPDATE, DELETE
    Base Url: https://mars.udacity.com/
    GET: realestate
    Assignment to a service arrangement instead of populating classes with transactions.
    MarsApı->MarsAPIService
     */

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