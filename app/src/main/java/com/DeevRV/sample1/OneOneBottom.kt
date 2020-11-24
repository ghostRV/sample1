package com.DeevRV.sample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.DeevRV.sample1.fragments.Tab1Fragment
import com.DeevRV.sample1.fragments.Tab2Fragment
import com.DeevRV.sample1.fragments.Tab3Fragment
import com.DeevRV.sample1.fragments.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_one_one_bottom.*

class OneOneBottom : BottomNav(0) {
    private val TAG = "OneOneBottom"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_one_bottom)
        Log.d(TAG, "onCrate")
        setupBottomNavigation()
        setUpTabs()


    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(Tab1Fragment(), title = "TAB1")
        adapter.addFragment(Tab2Fragment(), title = "TAB2")
        adapter.addFragment(Tab3Fragment(), title = "TAB3")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_favorite_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_settings_24)
    }


}