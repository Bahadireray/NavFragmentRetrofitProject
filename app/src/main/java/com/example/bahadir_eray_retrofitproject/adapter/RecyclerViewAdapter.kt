package com.example.bahadir_eray_retrofitproject.adapter


import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bahadir_eray_retrofitproject.R
import com.example.bahadir_eray_retrofitproject.databinding.RowLayoutBinding
import com.example.bahadir_eray_retrofitproject.model.MarsModel
import kotlinx.coroutines.withContext

class RecyclerViewAdapter(val marsList: List<MarsModel>) :
    RecyclerView.Adapter<RecyclerViewAdapter.MarsHolder>() {

    class MarsHolder(val recyclerRowLayoutBinding: RowLayoutBinding) :
        RecyclerView.ViewHolder(recyclerRowLayoutBinding.root) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarsHolder {

        val recyclerRowLayoutBinding =
            RowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MarsHolder(recyclerRowLayoutBinding)
    }

    override fun onBindViewHolder(holder: MarsHolder, position: Int) {
        holder.recyclerRowLayoutBinding.marsId.text = marsList[position].id.toString()
        holder.recyclerRowLayoutBinding.marsPrice.text = marsList[position].price.toString()
        holder.recyclerRowLayoutBinding.marsType.text = marsList[position].type.toString()
        val url = marsList[position].img_src
        Glide.with(holder.recyclerRowLayoutBinding.marsImageView)
            .load(url)
            .circleCrop()
            .placeholder(androidx.appcompat.R.drawable.abc_btn_default_mtrl_shape)
            .fallback(R.drawable.astranot)
            .into(holder.recyclerRowLayoutBinding.marsImageView)
        println("BAHADIR  $url")
    }

    override fun getItemCount(): Int {
        return marsList.count()
    }


}