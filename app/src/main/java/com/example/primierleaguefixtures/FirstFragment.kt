package com.example.primierleaguefixtures

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonfrag = view.findViewById<Button>(R.id.frag2)
        val navController = findNavController()
//        navController.navigate(R.id.action_fragmentOne_to_fragmentTwo)
        buttonfrag.setOnClickListener { navController.navigate(R.id.secondFragment) }
    }


}