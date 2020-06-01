package com.example.android.dogs.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.dogs.R
import com.example.android.dogs.adapter.HomeScreenAdapter
import com.example.android.dogs.adapter.HomeScreenListItem
import com.example.android.dogs.utility.initializeData

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categoryList:ArrayList<HomeScreenListItem> = initializeData()
        val homeScreenAdapter = HomeScreenAdapter(this, categoryList)
        val gridLayoutManager = GridLayoutManager(this,4,
            GridLayoutManager.HORIZONTAL, false)

        val recyclerView:RecyclerView = findViewById(R.id.home_screen_recyclerview)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.adapter = homeScreenAdapter
    }

}