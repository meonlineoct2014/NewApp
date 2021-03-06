package com.example.newapp.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.newapp.R
import com.example.newapp.databinding.FragmentHomeBinding
import com.example.newapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login){
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.buttonSignin.setOnClickListener {
            val username = binding.editTextUsername.text.toString()
            val password = binding.editTextTextPassword.text.toString()

            findNavController().
            navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username, password))
        }
        return view
    }
}