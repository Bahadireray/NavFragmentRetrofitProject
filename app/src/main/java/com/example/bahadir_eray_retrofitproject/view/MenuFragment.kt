package com.example.bahadir_eray_retrofitproject.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bahadir_eray_retrofitproject.R
import com.example.bahadir_eray_retrofitproject.adapter.RecyclerViewAdapter
import com.example.bahadir_eray_retrofitproject.databinding.FragmentMenuBinding
import com.example.bahadir_eray_retrofitproject.model.MarsModel
import com.example.bahadir_eray_retrofitproject.service.MarsAPIService
import io.reactivex.disposables.CompositeDisposable
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MenuFragment : Fragment(), RecyclerViewAdapter.Listener {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!
    private val marsAPIService = MarsAPIService()
    private var marsModel: ArrayList<MarsModel>? = null
    private var recyclerViewAdapter: RecyclerViewAdapter? = null

    // Disposable
    private var compositeDisposable: CompositeDisposable? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        compositeDisposable = CompositeDisposable()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getDataFromAPI()
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(
            requireContext().applicationContext,
            2,
            GridLayoutManager.VERTICAL,
            false
        )
        binding.recyclerView.layoutManager = layoutManager
    }

    override fun onItemClick(marsModel: MarsModel) {
        view?.let {
            Navigation.findNavController(it)
                .navigate(R.id.action_menuFragment_to_detailsFragment, Bundle().apply {
                    putString("marsIdDetail", marsModel.id.toString())
                    putString("marsTypeDetail", marsModel.type.toString())
                    putString("marsPriceDetail", marsModel.price.toString())
                    putString("marsImgDetail", marsModel.img_src)
                })
        }
    }

    private fun getDataFromAPI() {
        val call = marsAPIService.getMars()
        call.enqueue(object : Callback<List<MarsModel>> {
            override fun onResponse(
                call: Call<List<MarsModel>>,
                response: Response<List<MarsModel>>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        marsModel = ArrayList(it)
                        marsModel?.let {
                            recyclerViewAdapter = RecyclerViewAdapter(it!!, this@MenuFragment)
                            binding.recyclerView.adapter = recyclerViewAdapter
                        }
                    }
                }
            }

            override fun onFailure(call: Call<List<MarsModel>>, t: Throwable) {
                t.printStackTrace()
            }

        })
    }

}