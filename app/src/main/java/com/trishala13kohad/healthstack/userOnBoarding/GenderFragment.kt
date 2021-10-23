package com.trishala13kohad.healthstack.userOnBoarding

import android.opengl.GLException
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.trishala13kohad.healthstack.R

class GenderFragment : Fragment(R.layout.fragment_gender){

    private var maleSelected = true
    private var femaleSelected = false
    private lateinit var male: ImageView
    private lateinit var female: ImageView
    private lateinit var nextButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gender, container, false)
        nextButton = view.findViewById(R.id.next_button)
        nextButton.setOnClickListener{
            if(maleSelected || femaleSelected) {
                val action = GenderFragmentDirections.actionGenderFragmentToWeightFragment()
                findNavController().navigate(action)
            }
            else {
                Snackbar.make(view, "Please Select your gender", Snackbar.LENGTH_SHORT).show()
            }
        }
        return view
    }
}