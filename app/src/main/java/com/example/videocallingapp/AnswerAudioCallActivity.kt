package com.example.videocallingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_answer_audio_call.*

class AnswerAudioCallActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_audio_call)

        val buttonDanceAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_up_button)
        buttonAnswerCall.startAnimation(buttonDanceAnimation)
        buttonDanceAnimation.repeatCount = Animation.INFINITE
        buttonDanceAnimation.fillAfter = true


        buttonDanceAnimation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationRepeat(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                buttonAnswerCall.startAnimation(buttonDanceAnimation)
            }

            override fun onAnimationStart(animation: Animation?) {
            }

        })

        buttonCallCancelAnswer.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }


    }
}
