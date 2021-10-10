package com.trishala13kohad.healthstack

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val videoUrl =
            "android.resource://" + this.packageName.toString() + "/" + R.raw.splash_video
        val videoView: VideoView = findViewById(R.id.videoView)
        val videoUri: Uri = Uri.parse(videoUrl)
        videoView.isClickable = true
        videoView.setVideoURI(videoUri)
        videoView.start()

        val intent = Intent(this, MainActivity::class.java)
        videoView.setOnCompletionListener {
            startActivity(intent)
        }
        videoView.setOnClickListener{
            startActivity(intent)
        }
    }
}