package com.DeevRV.sample1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_two_bottom.*

class TwoBottom : BottomNav(1) {
    private val TAG = "TwoBottom"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_bottom)

        setupBottomNavigation()
        Log.d(TAG, "onCreate")

        bt2_1.setOnClickListener {
            val i = Intent(this, TwoTwoBottom::class.java)
            startActivity(i)
        }
        setSupportActionBar(toolbar)

    }



}