package com.example.android.dogs.utility

import com.example.android.dogs.adapter.HomeScreenListItem

fun initializeData(): ArrayList<HomeScreenListItem> {

    val categoryList = ArrayList<HomeScreenListItem>()

    categoryList.add(HomeScreenListItem("A-F"))
    categoryList.add(HomeScreenListItem("G-L"))
    categoryList.add(HomeScreenListItem("M-R"))
    categoryList.add(HomeScreenListItem("S-Z"))

    return categoryList
}