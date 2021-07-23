package com.softradix.hiltdemo

import androidx.lifecycle.*
import com.app.hiltretrofit.api.Countries
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(private val repository: Repository) : ViewModel() {
    private var mMutableLiveData = MutableLiveData<Countries>()
    private val liveData: LiveData<Countries>
        get() = mMutableLiveData

    fun getList() = liveData

    init {
        loadList()
    }

    private fun loadList() =
        viewModelScope.launch {
            val getList = repository.getPosts()
            if(getList.code()==200){
                mMutableLiveData.postValue(getList.body())

            }

        }

}