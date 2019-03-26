package com.example.droidknightssample

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlin.random.Random

class DemoActivity : AppCompatActivity() {

    private lateinit var container: MotionLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout =
            intent.getIntExtra("layout_file_id", R.layout.motion_01_fail_header_collapsible_toolbar)
        setContentView(layout)
        container = findViewById(R.id.motionLayout)

        when (layout) {
            R.layout.motion_03_fail_change_text -> {
                actionMotion03ChangeText()
            }
            R.layout.motion_03_success_change_text -> {
                actionMotion04ChangeText()
            }
        }
    }

    private fun actionMotion03ChangeText() {
        val textView = findViewById<TextView>(R.id.tvText1)
        val btnChange = findViewById<View>(R.id.btnChange)

        btnChange.setOnClickListener {
            textView.text = buildString {
                for (value in 0..Random.nextInt(10)) {
                    append(value)
                }
            }
        }
    }

    private fun actionMotion04ChangeText() {
        val textView = findViewById<TextView>(R.id.tvText1)
        val btnChange = findViewById<View>(R.id.btnChange)

        btnChange.setOnClickListener {
            textView.text = buildString {
                for (value in 0..Random.nextInt(10)) {
                    append(value)
                }
            }
            container.setTransition(R.id.start, R.id.end)
        }
    }
}
