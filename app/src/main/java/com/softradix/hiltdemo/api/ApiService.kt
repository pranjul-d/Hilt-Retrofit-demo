package com.softradix.hiltdemo.api

import com.softradix.hiltdemo.Response
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPosts(): retrofit2.Response<Response>
}