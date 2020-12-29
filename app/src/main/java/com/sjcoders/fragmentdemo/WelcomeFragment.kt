package com.sjcoders.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.sjcoders.fragmentdemo.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentWelcomeBinding>(inflater,R.layout.fragment_welcome,container,false)

        // Inflate the layout for this fragment

        binding.btnLogin.setOnClickListener { view:View ->
            view.findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToLoginFragment("",""))
        }

        binding.btnSignUp.setOnClickListener { view:View ->
            view.findNavController().navigate(R.id.action_welcomeFragment_to_signupFragment)
        }

        return binding.root
    }


}