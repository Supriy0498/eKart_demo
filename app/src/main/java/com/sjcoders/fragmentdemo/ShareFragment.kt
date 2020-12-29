package com.sjcoders.fragmentdemo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.sjcoders.fragmentdemo.databinding.FragmentAccountBinding
import com.sjcoders.fragmentdemo.databinding.FragmentMyCartBinding
import com.sjcoders.fragmentdemo.databinding.FragmentShareBinding

class ShareFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding = DataBindingUtil.inflate<FragmentShareBinding>(inflater,R.layout.fragment_share,container,false)

        binding.btnShare.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,"Hey Check out my app at this {link}")
            intent.setType("text/plain")
            startActivity(intent)
        }

        return binding.root

    }

}