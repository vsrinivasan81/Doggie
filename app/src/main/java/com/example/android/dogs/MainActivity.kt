package com.example.android.dogs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.android.dogs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    data class Welcome (var helloText: String = "")
    private lateinit var binding: ActivityMainBinding
    private lateinit var welcomeObject:Welcome

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        welcomeObject = Welcome(getString(R.string.welcome_text))
        binding.welcomeObj = welcomeObject
    }
}