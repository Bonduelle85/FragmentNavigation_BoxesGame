package com.example.fragmentnavigationboxesgame

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentnavigationboxesgame.databinding.FragmentBoxBinding

class FragmentBox: Fragment(), HasCustomTitle  {
    lateinit var binding: FragmentBoxBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentBoxBinding.inflate(inflater, container, false)

        binding.toMainMenuButton.setOnClickListener {
            onToMainMenuPressed()
        }
        return binding.root
    }

    private fun onToMainMenuPressed() {
        navigator().goToMenu()
    }

    override fun getTitleRes() = R.string.box
}