package com.DeevRV.sample1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_one_bottom.*

class OneBottom : BottomNav(0) {
    private val TAG = "OneBottom"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_bottom)
        Log.d(TAG, "onCreate")
        setupBottomNavigation()




        bt_button.setOnClickListener {
            val i = Intent(this, OneOneBottom::class.java)
            startActivity(i)
        }
        button.setOnClickListener {
            val i = Intent(this, ThreeThreeBottom::class.java)
            startActivity(i)
        }

    }
}
