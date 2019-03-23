package com.example.droidknightssample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val dataset: Array<DemosAdapter.Demo> = arrayOf(
        DemosAdapter.Demo(
            "01. Fail CollapsibleToolbar",
            "Sample",
            R.layout.motion_01_fail_collapsible
        ),
        DemosAdapter.Demo(
            "02. CollapsibleToolbar",
            "Sample",
            R.layout.motion_02_collapsible
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewAdapter = DemosAdapter(dataset)
        findViewById<RecyclerView>(R.id.recyclerView).apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = viewAdapter
        }
    }

    fun start(activity: Class<*>, layoutFileId: Int) {
        val intent = Intent(this, activity).apply {
            putExtra("layout_file_id", layoutFileId)
        }
        startActivity(intent)
    }
}
