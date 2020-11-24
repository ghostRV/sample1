package com.DeevRV.sample1


import android.os.Bundle
import android.content.Intent
import android.util.Log
import kotlinx.android.synthetic.main.activity_three_bottom.*
import kotlinx.android.synthetic.main.app_bar.*

class ThreeBottom : BottomNav(2) {
    private val TAG = "ThreeBottom"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_bottom)

        setSupportActionBar(toolbar)
        setupBottomNavigation()
        Log.d(TAG, "onCreate")
        button2.setOnClickListener {
            val i = Intent(this, ThreeThreeBottom::class.java)
            startActivity(i)

        }
        button3.setOnClickListener {
            val i = Intent(this, OneOneBottom::class.java)
            startActivity(i)
        }

    }
}