package com.example.android.dogs.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.dogs.R
import kotlinx.android.synthetic.main.homescreen_item_row.view.alphabetic_grouping

class HomeScreenAdapter(private val context: Context,
                        private val categoryList: ArrayList<HomeScreenListItem>) :
                        RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.homescreen_item_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = categoryList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.alphabetic_grouping.text = categoryList[position].category
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

}

data class HomeScreenListItem(var category: String)