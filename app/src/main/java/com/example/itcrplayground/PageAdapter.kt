package com.example.itcrplayground

import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter



class PageAdapter(fa: FragmentManager, lc: Lifecycle): FragmentStateAdapter(fa, lc) {

    override fun getItemCount() = 5


    override fun createFragment(position: Int): Fragment {
        if (position == 0){
            return VideoFragment()
        }
        if (position == 1 ){
            return NewsFragment()
        }
        if (position == 2){
            return AudioFragment()
        }
        if (position == 3){
            return HotFragment()
        }
        if (position == 4){
            return GamesFragment()
        }
        return Fragment()
    }


}