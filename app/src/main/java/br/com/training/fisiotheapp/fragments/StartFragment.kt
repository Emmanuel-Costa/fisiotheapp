package br.com.training.fisiotheapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.com.training.fisiotheapp.R
import br.com.training.fisiotheapp.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding = FragmentStartBinding.inflate(inflater, container, false)

        binding.btnStart.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_exerciseFragment)
        }

        return binding.root
    }
}