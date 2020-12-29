package com.sjcoders.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.sjcoders.fragmentdemo.databinding.FragmentAccountBinding
import com.sjcoders.fragmentdemo.databinding.FragmentMyCartBinding

class MyCartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding = DataBindingUtil.inflate<FragmentMyCartBinding>(inflater,R.layout.fragment_my_cart,container,false)

        return binding.root

    }

}