package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setlistener()
    }

    private fun setlistener() {
       val clickableViews : List<View> = listOf(box_one,box_two,box_three,box_four,box_five,constraint_layout,red_btn,green_btn,yellow_btn)

        for (item in clickableViews) {
            item.setOnClickListener{ makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

                // Boxes using Color class colors for background
                R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
                R.id.box_two -> view.setBackgroundColor(Color.GRAY)

                // Boxes using Android color resources for background
                R.id.box_three -> view.setBackgroundResource(android.R.color.holo_green_light)
                R.id.box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
                R.id.box_five -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_btn -> box_three.setBackgroundResource(R.color.my_red)
            R.id.yellow_btn -> box_four.setBackgroundResource(R.color.my_yellow)
            R.id.green_btn -> box_five.setBackgroundResource(R.color.my_green)

                else -> view.setBackgroundColor(Color.LTGRAY)
            }
        }
}



