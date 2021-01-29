package com.example.myviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {


    private var titleList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postToList()




        viewpager2.adapter = ViewPagerAdapter(titleList,descList,imagesList)
        viewpager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val indicator = findViewById<CircleIndicator3>(R.id.indicator)
        indicator.setViewPager(ViewPager2())








    }

    private fun addToList(title: String, description: String, image: Int) {

        titleList.add(title)
        descList.add(description)
        imagesList.add(image)


    }

    private fun postToList() {
        for (i :Int in 1..5){
            addToList("Title $i", "Description $i",  R.mipmap.ic_launcher_round)
        }
    }
}