package com.trishala13kohad.healthstack

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.VideoView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val videoUrl =
            "android.resource://" +
                    requireActivity().packageName.toString() + "/" + R.raw.splash_video
        val videoView: VideoView = view.findViewById(R.id.videoView)
        val videoUri: Uri = Uri.parse(videoUrl)
        videoView.isClickable = true
        videoView.setVideoURI(videoUri)
        videoView.start()

        videoView.setOnCompletionListener {
            val action = SplashFragmentDirections.actionSplashFragmentToViewPagerFragment()
            findNavController().navigate(action)
        }
    }
}