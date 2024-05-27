package com.example.mymoneyapp.ui.ingresos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mymoneyapp.databinding.FragmentIngresosBinding


class IngresosFragment : Fragment() {

    private var _binding: FragmentIngresosBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIngresosBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}