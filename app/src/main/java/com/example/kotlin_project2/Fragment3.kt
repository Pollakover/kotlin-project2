package com.example.kotlin_project2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class Fragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_3, container, false)

        val buttonFragmentManager = view.findViewById<Button>(R.id.buttonFragmentManager)
        val buttonNavigationAPI = view.findViewById<Button>(R.id.buttonNavigationAPI)

        buttonFragmentManager.setOnClickListener {
            val fragment1 = Fragment1()
            (activity as MainActivity).replaceFragment(fragment1)
        }
        buttonNavigationAPI.setOnClickListener {
            view.findNavController().navigate(R.id.action_fragment3_to_fragment1)
        }

        return view
    }
}
