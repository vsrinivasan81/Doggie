package com.example.android.dogs.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LaunchScreenActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityIntent = Intent(this, MainActivity::class.java)
        startActivity(activityIntent)
        finish()
    }
}