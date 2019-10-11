package com.example.videocallingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.custom_tool_bar.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageViewCall.setOnClickListener {startActivity(Intent(this,AudioCallActivity::class.java)) }
        imageViewVideoCall.setOnClickListener {startActivity(Intent(this,VideoCallActivity::class.java)) }
    }
}
