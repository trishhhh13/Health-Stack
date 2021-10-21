package com.trishala13kohad.healthstack.userOnBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.trishala13kohad.healthstack.R
import com.trishala13kohad.healthstack.signUpOrLogIn.LogInFragment
import com.trishala13kohad.healthstack.signUpOrLogIn.SignUpFragment
import com.trishala13kohad.healthstack.signUpOrLogIn.SignUpOrLoginFragment

class ViewPagerFragment : Fragment(R.layout.fragment_view_pager) {

    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_view_pager, container, false)

        viewPager = view.findViewById(R.id.viewPager)

        val fragmentList = arrayListOf(
            SignUpOrLoginFragment(),
            SignUpFragment(),
            LogInFragment(),
            WelcomeFragment(),
            GenderFragment(),
            WeightFragment(),
            HeightFragment(),
            BirthFragment(),
            WakeUpFragment(),
            SleepFragment()
        )
        val adapter = ViewPagerAdapter(fragmentList,
        requireActivity().supportFragmentManager, lifecycle)
        viewPager.adapter = adapter
        return view
    }


}