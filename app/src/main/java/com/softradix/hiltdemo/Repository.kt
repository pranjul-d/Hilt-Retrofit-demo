package com.softradix.hiltdemo

import androidx.lifecycle.liveData
import com.softradix.hiltdemo.api.ApiService
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import javax.inject.Inject

class Repository @Inject constructor(private val apiService: ApiService) {
    suspend fun getPosts() = apiService.getPosts()

}