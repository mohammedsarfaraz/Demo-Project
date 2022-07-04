package com.example.demoproject.Fragments

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.ArrayAdapter
import android.widget.SearchView

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import androidx.fragment.app.Fragment

import com.example.demoproject.R
import kotlinx.android.synthetic.main.fragment_chats.*


class ChatsFragment : Fragment() {


    private lateinit var listadapter : ArrayAdapter<String>

    val list = listOf<String>("sarfaraz","ibrahim","Sravan","akshat","sarfaraz","ibrahim","Sravan","akshat","sarfaraz","ibrahim","Sravan","akshat")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//         binding = FragmentChatsBinding.inflate(layoutInflater,container,false)
        val view = inflater.inflate(R.layout.fragment_chats,container,false)

        setHasOptionsMenu(true)

        (activity as AppCompatActivity).supportActionBar?.title = "my_title"

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

          listadapter = ArrayAdapter((activity as AppCompatActivity),android.R.layout.simple_list_item_1,list)

           list_view.adapter = listadapter

    }

//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        search_bar.setOnQueryTextListener( object : OnQueryTextListener,androidx.appcompat.widget.SearchView.OnQueryTextListener{
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                TODO("Not yet implemented")
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                TODO("Not yet implemented")
//            }
//
//        })
//        super.onCreateOptionsMenu(menu, inflater)
//    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        search_bar.setOnQueryTextListener(object : SearchView.OnQueryTextListener,androidx.appcompat.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                listadapter.filter.filter(newText)
                listadapter.notifyDataSetChanged()
                return true
            }
        })
        super.onCreateOptionsMenu(menu, inflater)
    }


    }


