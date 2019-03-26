package com.example.droidknightssample

import android.os.Bundle
import android.transition.TransitionManager
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class DemoActivity : AppCompatActivity() {

    private lateinit var container: ViewGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout =
            intent.getIntExtra("layout_file_id", R.layout.motion_01_fail_header_collapsible_toolbar)
        setContentView(layout)
        container = findViewById(R.id.motionLayout)

        if (layout == R.layout.motion_03_fail_change_text) {
            actionChangeText()
        }
    }

    private fun actionChangeText() {
        val textView = findViewById<TextView>(R.id.tvText1)
        val btnChange = findViewById<View>(R.id.btnChange)

        btnChange.setOnClickListener {
            TransitionManager.beginDelayedTransition(container)
            textView.text = buildString {
                for (value in 0..Random.nextInt(10)) {
                    append(value)
                }
            }
        }
    }
}
