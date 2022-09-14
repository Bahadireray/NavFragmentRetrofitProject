package com.example.bahadir_eray_retrofitproject.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bahadir_eray_retrofitproject.R
import com.example.bahadir_eray_retrofitproject.databinding.RowLayoutBinding
import com.example.bahadir_eray_retrofitproject.model.MarsModel
import com.squareup.picasso.Picasso

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

        var img = holder.recyclerRowLayoutBinding.marsImageView
        holder.recyclerRowLayoutBinding.marsId.text = marsList[position].id.toString()
        holder.recyclerRowLayoutBinding.marsPrice.text = marsList[position].price.toString()
        holder.recyclerRowLayoutBinding.marsType.text = marsList[position].type.toString()
        Picasso.get()
            .load(marsList[position].img_src)
            .placeholder(R.drawable.astranot)
            .error(R.drawable.rocket)
            .into(holder.recyclerRowLayoutBinding.marsImageView)
        println("$marsList[position].img_src  NEZIMEN")

    }

    override fun getItemCount(): Int {
        return marsList.count()
    }


}