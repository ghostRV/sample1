package com.DeevRV.sample1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.isEnabled = false
        check1.setOnCheckedChangeListener(this)
        check2.setOnCheckedChangeListener(this)

        button1.setOnClickListener {
            val intent = Intent(this, OneBottom::class.java)
            startActivity(intent)
        }

    }
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean)  {

        button1.isEnabled = check1.isChecked && check2.isChecked
    }
}