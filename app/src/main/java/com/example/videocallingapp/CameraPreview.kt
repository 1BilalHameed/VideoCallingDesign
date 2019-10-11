package com.example.videocallingapp

import android.content.Context
import android.graphics.Camera
import android.view.SurfaceHolder
import android.view.SurfaceView

class CameraPreview(context : Context,
                    private val camera : Camera) : SurfaceView(context) , SurfaceHolder.Callback{

    override fun surfaceChanged(holder: SurfaceHolder?, format: Int, width: Int, height: Int) {

    }

    override fun surfaceDestroyed(holder: SurfaceHolder?) {

    }

    override fun surfaceCreated(holder: SurfaceHolder?) {

    }
}