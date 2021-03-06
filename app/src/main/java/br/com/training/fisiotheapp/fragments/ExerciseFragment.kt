package br.com.training.fisiotheapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.training.fisiotheapp.R
import br.com.training.fisiotheapp.databinding.FragmentExerciseBinding

class ExerciseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding = FragmentExerciseBinding.inflate(inflater, container, false)
        return binding.root
    }
}