package com.example.admin.retrofitcricket;

import retrofit2.Call;
import retrofit2.http.GET;

interface ApiService {
    @GET("cricket.json")
    Call<Cricket> getCricket();
}
