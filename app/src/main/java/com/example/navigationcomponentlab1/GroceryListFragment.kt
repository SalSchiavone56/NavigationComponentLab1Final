package com.example.navigationcomponentlab1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.findNavController
import com.example.navigationcomponentlab1.databinding.FragmentGroceryListBinding


class GroceryListFragment : Fragment() {

    private var _binding: FragmentGroceryListBinding? = null
    private val binding get() =_binding!!
    val itemsAdded: MutableList<String> = mutableListOf()
    var viewIndex = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGroceryListBinding.inflate(inflater, container, false)
        val rootview = binding.root
        val itemViews = listOf(
            binding.selected1,
            binding.selected2,
            binding.selected3,
            binding.selected4,
            binding.selected5
        )
        setFragmentResultListener("requestKey") { requestKey, bundle ->
            val result = bundle.getString("bundleKey")
            viewIndex++
            if (result != null && viewIndex <= 5) {
                itemsAdded.add(result)
            }
                for ((index) in itemsAdded.withIndex()) {
                    itemViews[index].visibility = View.VISIBLE
                    itemViews[index].text = itemsAdded[index]
                }
        }
        binding.addItemButton.setOnClickListener{view->
            val action2 = GroceryListFragmentDirections.actionGroceryListFragmentToChooseItemFragment()
            rootview.findNavController().navigate(action2)
        }
        val args = GroceryListFragmentArgs.fromBundle(requireArguments())
        binding.welcomeTextView.text =  "Welcome ${args.nameArg}!"
        return rootview
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}