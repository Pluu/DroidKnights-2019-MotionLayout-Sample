package com.example.droidknightssample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class DemoActivity : AppCompatActivity() {

    private lateinit var container: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout =
            intent.getIntExtra("layout_file_id", R.layout.motion_01_fail_header_collapsible_toolbar)
        setContentView(layout)
        container = findViewById(R.id.motionLayout)
    }
}
