package com.example.itcrplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

private lateinit var appBar: AppBarLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout>(R.id.tabs)
        val viewPager = findViewById<ViewPager2>(R.id.view_pager)
        viewPager.isUserInputEnabled = false

        val vpAdapter = PageAdapter(supportFragmentManager, lifecycle)

        viewPager.adapter = vpAdapter

        TabLayoutMediator(tabLayout, viewPager){ tab, position ->
            when(position){
                0 -> {
                    tab.text = "Video"
                }
                1 -> {
                    tab.text = "News"
                }
                2 -> {
                    tab.text = "Audio"
                }
                3 -> {
                    tab.text = "Hot"
                }
                4 -> {
                    tab.text = "Games"
                }
            }
        }.attach()

//        val radius = resources.getDimension(R.dimen.bottom_corner)
//        appBar = findViewById(R.id.appBar)

       // val bottomCornerAppBar = appBar.background as MaterialShapeDrawable
//        bottomCornerAppBar.shapeAppearanceModel.apply {
//            bottomCornerAppBar.
//        }

//        val bottomCornerAppBar = appBar.getBackground() as MaterialShapeDrawable
//        bottomCornerAppBar.shapeAppearanceModel = bottomCornerAppBar.shapeAppearanceModel
//            .toBuilder()
//            .setBottomRightCorner(CornerFamily.ROUNDED, radius)
//            .setBottomLeftCorner(CornerFamily.ROUNDED, radius)
//            .build()
    }
}