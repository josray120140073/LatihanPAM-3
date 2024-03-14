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

class Fragment1 : Fragment() {


    private var _binding: Fragment1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = Fragment1Binding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.tvFragment1.text = "Ini Fragment 1"


        binding.buttonFrag1.setOnClickListener {

            binding.root.setBackgroundColor(resources.getColor(android.R.color.holo_red_light))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}