
package com.sarbrothers.dhamakafastfood

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)
        layout.setBackgroundColor(Color.WHITE)

        val title = TextView(this)
        title.text = "DHAMAKA FAST FOOD"
        title.textSize = 28f
        title.setTextColor(Color.RED)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "Welcome to Dhamaka Fast Food!"
        subtitle.textSize = 18f
        subtitle.setTextColor(Color.BLACK)
        subtitle.gravity = Gravity.CENTER

        layout.addView(title)
        layout.addView(subtitle)

        setContentView(layout)
    }
}
