package com.example.navigationcomponentlab1



import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.findNavController
import com.example.navigationcomponentlab1.databinding.FragmentChooseItemBinding


class ChooseItemFragment : Fragment() {

    private var _binding: FragmentChooseItemBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentChooseItemBinding.inflate(inflater, container,false)
        val rootview = binding.root
        binding.choiceOne.setOnClickListener{view->
            val food=binding.choiceOne.text.toString()
            setFragmentResult("requestKey",bundleOf("bundleKey" to food))
            rootview.findNavController().navigateUp()
        }
        binding.choiceTwo.setOnClickListener{view->
            val food=binding.choiceTwo.text.toString()
            setFragmentResult("requestKey",bundleOf("bundleKey" to food))
            rootview.findNavController().navigateUp()
        }
        binding.choiceThree.setOnClickListener{view->
            val food=binding.choiceThree.text.toString()
            setFragmentResult("requestKey",bundleOf("bundleKey" to food))
            rootview.findNavController().navigateUp()
        }
        binding.choiceFour.setOnClickListener{view->
            val food=binding.choiceFour.text.toString()
            setFragmentResult("requestKey",bundleOf("bundleKey" to food))
            rootview.findNavController().navigateUp()
        }
        binding.choiceFive.setOnClickListener{view->
            val food=binding.choiceFive.text.toString()
            setFragmentResult("requestKey",bundleOf("bundleKey" to food))
            rootview.findNavController().navigateUp()
        }
        binding.choiceSix.setOnClickListener{view->
            val food=binding.choiceSix.text.toString()
            setFragmentResult("requestKey",bundleOf("bundleKey" to food))
            rootview.findNavController().navigateUp()
        }
        binding.choiceSeven.setOnClickListener{view->
            val food=binding.choiceSeven.text.toString()
            setFragmentResult("requestKey",bundleOf("bundleKey" to food))
            rootview.findNavController().navigateUp()
        }
        binding.choiceEight.setOnClickListener{view->
            val food=binding.choiceEight.text.toString()
            setFragmentResult("requestKey",bundleOf("bundleKey" to food))
            rootview.findNavController().navigateUp()
        }
        return rootview
    }
    override fun onDestroyView(){
        super.onDestroyView()
        _binding=null
    }
}