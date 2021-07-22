package com.softradix.hiltdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.softradix.hiltdemo.databinding.ListItemsBinding
import javax.inject.Inject

class RecyclerAdapter @Inject constructor(var mList: ArrayList<ResponseItem>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    class ViewHolder(private val binding: ListItemsBinding) : RecyclerView.ViewHolder(binding.root) {
       fun bind(mList: ResponseItem){

           binding.textView.text =mList.title

       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ListItemsBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mList[position])
    }

    override fun getItemCount() = mList.size
}