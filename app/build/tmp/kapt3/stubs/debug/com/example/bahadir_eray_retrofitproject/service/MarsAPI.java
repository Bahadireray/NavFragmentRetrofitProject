package com.example.bahadir_eray_retrofitproject.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/example/bahadir_eray_retrofitproject/service/MarsAPI;", "", "getData", "Lretrofit2/Call;", "", "Lcom/example/bahadir_eray_retrofitproject/model/MarsModel;", "app_debug"})
public abstract interface MarsAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "realestate")
    public abstract retrofit2.Call<java.util.List<com.example.bahadir_eray_retrofitproject.model.MarsModel>> getData();
}