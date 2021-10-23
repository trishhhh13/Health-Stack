package com.trishala13kohad.healthstack.userOnBoarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.trishala13kohad.healthstack.MainActivity
import com.trishala13kohad.healthstack.R

class WelcomeFragment : Fragment(R.layout.fragment_welcome){

    private lateinit var welcomeButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        welcomeButton = view.findViewById(R.id.go_button)
        welcomeButton.setOnClickListener{
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToGenderFragment()
            findNavController().navigate(action)
        }
        return view
    }
}