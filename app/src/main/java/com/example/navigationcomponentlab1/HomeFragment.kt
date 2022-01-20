package com.example.navigationcomponentlab1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.navigationcomponentlab1.databinding.FragmentHomeBinding



class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding?=null
    private val binding get()=_binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentHomeBinding.inflate(inflater, container,false)
        val rootview = binding.root
        binding.startButton.setOnClickListener{view->
            val name=binding.edtTextName.text.toString()
            val action1=HomeFragmentDirections.actionHomeFragmentToGroceryListFragment(name)
            rootview.findNavController().navigate(action1)
        }
        return rootview
    }
    override fun onDestroyView(){
        super.onDestroyView()
        _binding=null
    }
}