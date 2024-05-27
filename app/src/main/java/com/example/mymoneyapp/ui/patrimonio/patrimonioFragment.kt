package com.example.mymoneyapp.ui.patrimonio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mymoneyapp.R
import com.example.mymoneyapp.databinding.FragmentGastosBinding
import com.example.mymoneyapp.databinding.FragmentPatrimonioBinding

class patrimonioFragment : Fragment() {
    private var _binding: FragmentPatrimonioBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPatrimonioBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}