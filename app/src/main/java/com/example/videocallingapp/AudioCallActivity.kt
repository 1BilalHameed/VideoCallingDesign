package com.example.videocallingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import kotlinx.android.synthetic.main.activity_audio_call.*

class AudioCallActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_call)

        buttonCallCancel.setOnClickListener {
            startActivity(Intent(this, AnswerAudioCallActivity::class.java))
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_voice_call, menu)
        return super.onCreateOptionsMenu(menu)
    }


}
