package com.example.demoproject.ui.home

import android.icu.text.Transliterator
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.demoproject.R
import com.example.demoproject.adapters.PagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {


        val view = inflater.inflate(R.layout.fragment_home, container, false)

//        setHasOptionsMenu(true)



        view.view_pager.adapter = PagerAdapter(childFragmentManager)

        val tablayout = view.findViewById<TabLayout>(R.id.tab_layout)
        val viewpager = view .findViewById<ViewPager>(R.id.view_pager)


        tablayout.setupWithViewPager(viewpager)

        (activity as AppCompatActivity).supportActionBar?.title = "my_title"


        return view

    }

//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        inflater.inflate(R.menu.menu, menu)
//        super.onCreateOptionsMenu(menu, inflater)
//    }




}



