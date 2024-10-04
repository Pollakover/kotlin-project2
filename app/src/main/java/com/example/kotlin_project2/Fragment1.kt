package com.example.kotlin_project2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_1, container, false)

        val buttonFragmentManager = view.findViewById<Button>(R.id.buttonFragmentManager)
        val buttonNavigationAPI = view.findViewById<Button>(R.id.buttonNavigationAPI)

        buttonFragmentManager.setOnClickListener {
            val fragment2 = Fragment2()
            (activity as MainActivity).replaceFragment(fragment2)
        }
        buttonNavigationAPI.setOnClickListener {
            view.findNavController().navigate(R.id.action_fragment1_to_fragment2)
        }

        return view
    }
}


