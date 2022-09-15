package com.example.bahadir_eray_retrofitproject.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bahadir_eray_retrofitproject.R
import com.example.bahadir_eray_retrofitproject.databinding.RowLayoutBinding
import com.example.bahadir_eray_retrofitproject.model.MarsModel
import com.squareup.picasso.Picasso

class RecyclerViewAdapter(val marsList: List<MarsModel>, private val listener: Listener) :
    RecyclerView.Adapter<RecyclerViewAdapter.MarsHolder>() {
    /*
    Recycle View, a function to listen for clicks.
    An interface was made to be called from outside.
     */
    interface Listener {
        fun onItemClick(marsModel: MarsModel)
    }

    class MarsHolder(val recyclerRowLayoutBinding: RowLayoutBinding) :
        RecyclerView.ViewHolder(recyclerRowLayoutBinding.root) {
        fun bind(marsModel: MarsModel, position: Int, listener: Listener) {
            itemView.setOnClickListener {
                listener.onItemClick(marsModel)
            }
        }
    }

    //Function used to define the custom row view created.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarsHolder {
        val recyclerRowLayoutBinding =
            RowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MarsHolder(recyclerRowLayoutBinding)
    }

    /*We equate the values of the 'MarsList' with the data in the values we hold the views.
    A special library for images -> Picasso
     */
    override fun onBindViewHolder(holder: MarsHolder, position: Int) {
        holder.recyclerRowLayoutBinding.marsId.text = marsList[position].id.toString()
        holder.recyclerRowLayoutBinding.marsPrice.text = marsList[position].price.toString()
        holder.recyclerRowLayoutBinding.marsType.text = marsList[position].type.toString()
        Picasso.get()
            .load(marsList[position].img_src)
            .placeholder(R.drawable.astranot)
            .error(R.drawable.rocket)
            .into(holder.recyclerRowLayoutBinding.marsImageView)
        holder.bind(marsList[position], position, listener)
    }

    //We get the number of lists.
    override fun getItemCount(): Int {
        return marsList.count()
    }
}