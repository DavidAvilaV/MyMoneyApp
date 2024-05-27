package com.example.mymoneyapp.ui.config

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mymoneyapp.R
import com.example.mymoneyapp.databinding.FragmentConfigBinding
import com.example.mymoneyapp.databinding.FragmentGastosBinding

class configFragment : Fragment() {
    private var _binding: FragmentConfigBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentConfigBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}