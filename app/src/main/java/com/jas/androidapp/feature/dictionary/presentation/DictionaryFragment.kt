package com.jas.androidapp.feature.dictionary.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.jas.androidapp.R
import com.jas.androidapp.databinding.FragmentDictionaryBinding
import com.jas.androidapp.databinding.FragmentMenuBinding


class DictionaryFragment : Fragment() {

    private lateinit var dictionaryBinding: FragmentDictionaryBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navController = findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dictionaryBinding = FragmentDictionaryBinding.inflate(layoutInflater)
        dictionaryBinding.textView.setOnClickListener {
            navController.popBackStack()
        }
        return dictionaryBinding.root
    }


}