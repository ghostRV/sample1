package com.DeevRV.sample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class TwoTwoBottom : BottomNav(1) {
    private val TAG = "TwoTwoBottom"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_two_bottom)
        Log.d(TAG, "onCreate")
        setupBottomNavigation()





    }

}