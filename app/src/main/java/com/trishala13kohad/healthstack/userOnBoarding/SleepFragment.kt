package com.trishala13kohad.healthstack.userOnBoarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.trishala13kohad.healthstack.R

class SleepFragment : Fragment(R.layout.fragment_sleep){
    private lateinit var nextButton: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sleep, container, false)
        nextButton = view.findViewById(R.id.next_button)

        nextButton.setOnClickListener {
            val action = SleepFragmentDirections.actionSleepFragmentToSignUpFragment()
            findNavController().navigate(action)
        }
        return view
    }
}