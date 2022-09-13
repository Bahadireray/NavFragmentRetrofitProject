package com.example.bahadir_eray_retrofitproject

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.toColorInt
import com.example.bahadir_eray_retrofitproject.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val homeTxt = "Let’s Explore the Solar System with Explorer"
        val colorSpan = SpannableString(homeTxt)
        val txtOrange = ForegroundColorSpan(Color.parseColor("#F9AD1A"))

        colorSpan.setSpan(txtOrange, 18, 30, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
        binding.txtHomeText.text = colorSpan


    }
}
