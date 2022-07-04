package com.example.demoproject.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.demoproject.Fragments.CallFragment
import com.example.demoproject.Fragments.ChatsFragment
import com.example.demoproject.Fragments.StatusFragment

class PagerAdapter(supportFragment: FragmentManager) : FragmentPagerAdapter(supportFragment) {


    val fragmentlist = ArrayList<Fragment>()

   override fun getCount(): Int {
       return 3
   }

   override fun getItem(position: Int): Fragment {
        return when (position) {

           0 -> return ChatsFragment()
            1 -> return  StatusFragment()

           2 -> return CallFragment()
            else -> {
               return ChatsFragment()
           }
      }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {

            0 -> return "Chats"

            1 -> return "Status"

            2 -> return "Calls"
            else -> {
                return ""
            }
        }
    }
}