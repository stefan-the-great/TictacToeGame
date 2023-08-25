package com.example.tictactoegame

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabPageAdapter(activity: FragmentActivity, private val tabCount: Int): FragmentStateAdapter(activity)
{
    override fun getItemCount(): Int = tabCount

    override fun createFragment(position: Int): Fragment {

        return when(position)
        {
            0 -> HomeFragment()
            1 -> AboutFragment()
            2 -> HelpFragment()
            else -> HomeFragment()
        }
    }
}