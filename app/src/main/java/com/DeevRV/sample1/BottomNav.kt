package com.DeevRV.sample1

import android.content.Intent
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_nav.*


abstract class BottomNav(val navNumber: Int) : AppCompatActivity() {
    private val TAG = "BottomNav"
    fun setupBottomNavigation() {
        bottom_navigation_view.setOnNavigationItemSelectedListener {
            val nextActivity =
                when (it.itemId) {
                    R.id.item1 -> OneBottom::class.java
                    R.id.item2 -> TwoBottom::class.java
                    R.id.item3 -> ThreeBottom::class.java
                    else -> {
                        Log.e(TAG, "unknown nav item clicked $it")
                        null
                    }
                }
            if (nextActivity != null) {
                val intent = Intent(this, nextActivity)
                intent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
                startActivity(intent)
                overridePendingTransition(0, 0)
                true
            } else {
                false
            }
        }
        bottom_navigation_view.menu.getItem(navNumber).isChecked = true
    }
}

