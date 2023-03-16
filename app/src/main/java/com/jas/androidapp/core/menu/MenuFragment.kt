package com.jas.androidapp.core.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.jas.androidapp.R
import com.jas.androidapp.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {

    private lateinit var navController: NavController
    private lateinit var menuBinding: FragmentMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navController = findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (requireActivity() as AppCompatActivity).supportActionBar?.hide()
        menuBinding = FragmentMenuBinding.inflate(layoutInflater)
        menuBinding.textView.setOnClickListener {
            navController.navigate(R.id.to_dictionary)
        }
        return menuBinding.root
    }

    override fun onDestroyView() {
        (requireActivity() as AppCompatActivity).supportActionBar?.show()
        super.onDestroyView()
    }

    companion object {
    }
}