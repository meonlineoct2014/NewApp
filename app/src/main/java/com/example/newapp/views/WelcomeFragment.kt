package com.example.newapp.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.newapp.R
import com.example.newapp.databinding.FragmentLoginBinding
import com.example.newapp.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {
    private val args: WelcomeFragmentArgs by navArgs()

    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.textUserNameWelcome.text = args.username
        binding.textPasswordWelcome.text = args.password
        binding.buttonConfirm.setOnClickListener {
            findNavController().
            navigate(WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment())
        }
        return view
    }

}