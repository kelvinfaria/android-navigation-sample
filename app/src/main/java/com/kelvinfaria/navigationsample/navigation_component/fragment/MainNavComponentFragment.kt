package com.kelvinfaria.navigationsample.navigation_component.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kelvinfaria.navigationsample.R
import com.kelvinfaria.navigationsample.databinding.FragmentMainNavComponentBinding

class MainNavComponentFragment : Fragment() {

    private lateinit var binding: FragmentMainNavComponentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainNavComponentBinding.inflate(inflater, container, false)
        return binding.root
    }
}