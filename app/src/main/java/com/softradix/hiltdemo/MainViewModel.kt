package com.softradix.hiltdemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(private val repository: Repository) : ViewModel() {
    private val mListLiveData= MutableLiveData<List<ResponseItem>?>()

    fun getListItems() = mListLiveData
    init {

        loadList()
    }

    private fun loadList() {

        viewModelScope.launch {
            val getList = repository.getPosts()
//            TODO: Do EMIT HERE in app using repositories
//            emit(Resource.loading(null))
//            try {
//                emit(Resource.success(apiService.getPosts().response))
//            } catch (e: Exception) {
//                emit(Resource.error(null, message = e.message.toString()))
//            }
        }
    }
}