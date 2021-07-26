package com.softradix.hiltdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.hiltretrofit.api.Countries
import com.app.hiltretrofit.api.CountriesItem
import com.app.hiltretrofit.main.Country
import com.softradix.hiltdemo.databinding.ListItemsBinding
import javax.inject.Inject

class RecyclerAdapter @Inject constructor() :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var mList: Countries = Countries()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ListItemsBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        mList[position].let { holder.bind(it) }
    }
    
    class ViewHolder(private val binding: ListItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(mList: CountriesItem) {
            binding.apply {
                mList.also {
                    textView.text = mList.name
                }
            }
        }
    }

    override fun getItemCount() = mList.size
}