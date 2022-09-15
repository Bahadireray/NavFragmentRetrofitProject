package com.example.bahadir_eray_retrofitproject.view

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.bahadir_eray_retrofitproject.R
import com.example.bahadir_eray_retrofitproject.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    //View Binding
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

    //Processed for custom texts on the splash screen.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val homeTxt = "Let’s Explore the Solar System with Explorer"
        val colorSpan = SpannableString(homeTxt)
        val txtOrange = ForegroundColorSpan(Color.parseColor("#F9AD1A"))

        colorSpan.setSpan(txtOrange, 18, 30, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
        binding.txtHomeText.text = colorSpan
        binding.loginButton.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_menuFragment)
        }
    }
}
