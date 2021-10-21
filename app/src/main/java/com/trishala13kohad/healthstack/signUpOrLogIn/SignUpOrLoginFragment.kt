package com.trishala13kohad.healthstack.signUpOrLogIn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.trishala13kohad.healthstack.R

class SignUpOrLoginFragment : Fragment(R.layout.fragment_sign_up_or_login){

    private lateinit var signUp: Button
    private lateinit var logIn: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_sign_up_or_login, container, false)

        signUp = view.findViewById(R.id.sign_up_button)
        logIn = view.findViewById(R.id.log_in_button)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        signUp.setOnClickListener{
            viewPager?.currentItem = 1
        }
        logIn.setOnClickListener{
            viewPager?.currentItem = 2
        }

        return view
    }
}