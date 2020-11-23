package com.DeevRV.sample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ThreeThreeBottom : BottomNav(2) {
    private val TAG = "ThreeThreeBottom"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_three_bottom)
        Log.d(TAG, "OnCrate")
        setupBottomNavigation()
    }
}