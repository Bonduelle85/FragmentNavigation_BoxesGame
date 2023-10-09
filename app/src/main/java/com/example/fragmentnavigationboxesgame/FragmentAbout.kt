package com.example.fragmentnavigationboxesgame

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentnavigationboxesgame.databinding.FragmentAboutBinding

class FragmentAbout: Fragment(), HasCustomTitle {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = FragmentAboutBinding.inflate(inflater, container, false).apply {
        versionNameTextView.text = R.string.version.toString()
        versionCodeTextView.text = R.string.code.toString()
        okButton.setOnClickListener { onOkPressed() }
    }.root

    override fun getTitleRes(): Int = R.string.about

    private fun onOkPressed() {
        navigator().goBack()
    }

}