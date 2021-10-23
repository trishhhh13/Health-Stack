package com.trishala13kohad.healthstack.userOnBoarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.trishala13kohad.healthstack.R

class WeightFragment : Fragment(R.layout.fragment_weight){

    private lateinit var nextButton: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_weight, container, false)
        nextButton = view.findViewById(R.id.next_button)

        nextButton.setOnClickListener {
            val action = WeightFragmentDirections.actionWeightFragmentToHeightFragment()
            findNavController().navigate(action)
        }
        return view
    }
}