package com.jas.androidapp.feature.dictionary.presentation

import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.jas.androidapp.R
import com.jas.androidapp.databinding.FragmentDictionaryBinding
import com.jas.androidapp.databinding.FragmentMenuBinding


class DictionaryFragment : Fragment() {

    private var dictionaryBinding: FragmentDictionaryBinding? = null
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navController = findNavController()
        val animation = TransitionInflater.from(requireContext()).inflateTransition(android.R.transition.move)
        sharedElementEnterTransition = animation
        sharedElementReturnTransition = animation

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dictionaryBinding = FragmentDictionaryBinding.inflate(layoutInflater)
        dictionaryBinding?.let {
            it.textView.setOnClickListener {
                navController.popBackStack()
            }
            it.imageView.setOnClickListener {
                navController.popBackStack()
            }
        }
        return dictionaryBinding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        dictionaryBinding = null

    }


}