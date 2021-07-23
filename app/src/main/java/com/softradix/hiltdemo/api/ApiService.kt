package com.softradix.hiltdemo.api

import com.app.hiltretrofit.api.Countries
import com.app.hiltretrofit.main.Country
import retrofit2.Response

import retrofit2.http.GET

interface ApiService {
    @GET("region/europe")
    suspend fun getPosts(): Response<Countries>
}