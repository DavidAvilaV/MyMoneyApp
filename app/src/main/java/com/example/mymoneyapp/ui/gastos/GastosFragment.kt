package com.example.mymoneyapp.ui.gastos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mymoneyapp.R
import com.example.mymoneyapp.databinding.FragmentGastosBinding


class GastosFragment : Fragment() {

    private var _binding: FragmentGastosBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGastosBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}