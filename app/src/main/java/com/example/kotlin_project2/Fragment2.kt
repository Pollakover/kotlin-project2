package com.example.kotlin_project2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_2, container, false)

        val buttonFragmentManager = view.findViewById<Button>(R.id.buttonFragmentManager)
        val buttonNavigationAPI = view.findViewById<Button>(R.id.buttonNavigationAPI)

        buttonFragmentManager.setOnClickListener {
            val fragment3 = Fragment3()
            (activity as MainActivity).replaceFragment(fragment3)
        }
        buttonNavigationAPI.setOnClickListener {
            view.findNavController().navigate(R.id.action_fragment2_to_fragment3)
        }

        return view
    }
}
