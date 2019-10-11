package com.example.videocallingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_video_call.*

class VideoCallActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_call)

        cameraView.setLifecycleOwner(this)
        buttonVideoCallCancelAnswer.setOnClickListener { startActivity(Intent(this,AnswerVideoCallActivity::class.java)) }

    }
}
