package com.trishala13kohad.healthstack

import android.net.Uri
import android.opengl.Visibility
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.Toolbar
import android.widget.VideoView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class InitialVideoFragment : Fragment(){
    private lateinit var toolbar: Toolbar
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



//        videoView.setOnCompletionListener {
//            val action = InitialVideoFragmentDirections.actionInitialVideoFragmentToWaterReminderFragment()
//            findNavController().navigate(action)
//        }
//
//        videoView.setOnClickListener {
//            val action = InitialVideoFragmentDirections.actionInitialVideoFragmentToWaterReminderFragment()
//            findNavController().navigate(action)
//        }
    }
}