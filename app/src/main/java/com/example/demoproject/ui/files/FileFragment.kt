package com.example.demoproject.ui.files

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.demoproject.databinding.FragmentFileBinding

class FileFragment : Fragment() {

    private var _binding: FragmentFileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

//        val fileViewModel = ViewModelProvider(this).get(FileViewModel::class.java)

        _binding = FragmentFileBinding.inflate(inflater, container, false)

         val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}