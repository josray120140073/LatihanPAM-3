package com.example.pamlatihan3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pamlatihan3.databinding.ActivityMainBinding
import com.example.pamlatihan3.databinding.Fragment1Binding
import com.example.pamlatihan3.databinding.Fragment2Binding

class Fragment2 : Fragment() {


    private var _binding: Fragment2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = Fragment2Binding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set initial text
        binding.tvFragment2.text = "Ini Fragment 2"

        // Button click listener to change background color
        binding.buttonFrag2.setOnClickListener {
            // Change background color to red
            binding.root.setBackgroundColor(resources.getColor(android.R.color.holo_green_light))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}