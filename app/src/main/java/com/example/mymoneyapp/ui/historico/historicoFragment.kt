package com.example.mymoneyapp.ui.historico

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mymoneyapp.R
import com.example.mymoneyapp.databinding.FragmentGastosBinding
import com.example.mymoneyapp.databinding.FragmentHistoricoBinding

class historicoFragment : Fragment() {
    private var _binding: FragmentHistoricoBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHistoricoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}