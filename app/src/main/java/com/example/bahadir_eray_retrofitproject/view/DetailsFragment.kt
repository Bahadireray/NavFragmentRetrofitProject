package com.example.bahadir_eray_retrofitproject.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bahadir_eray_retrofitproject.R
import com.example.bahadir_eray_retrofitproject.databinding.FragmentDetailsBinding
import com.example.bahadir_eray_retrofitproject.model.MarsModel
import com.squareup.picasso.Picasso


class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!
    private var intent = Intent()
    private var marsModel: MarsModel? = null
    private var marsList: List<MarsModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailsBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val img = requireArguments().getString("marsImgDetail")
        binding.marsIdDetails.text = requireArguments().getString("marsIdDetail")
        binding.marsTypeDetails.text = requireArguments().getString("marsTypeDetail")
        binding.marsPriceDetails.text = requireArguments().getString("marsPriceDetail")

        Picasso.get()
            .load(img)
            .placeholder(R.drawable.astranot)
            .error(R.drawable.rocket)
            .into(binding.imageViewDetail)

    }
}


