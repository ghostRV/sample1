package com.DeevRV.sample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_one_one_bottom.*

class OneOneBottom : BottomNav(0) {
    private val TAG = "OneOneBottom"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_one_bottom)
        Log.d(TAG, "onCrate")
        setupBottomNavigation()


    }


}