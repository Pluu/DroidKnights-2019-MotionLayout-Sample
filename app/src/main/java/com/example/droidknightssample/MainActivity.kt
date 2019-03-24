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
            "Complex MotionLayout Sample",
            R.layout.motion_01_success_collapsible
        ),
        DemosAdapter.Demo(
            "03. Fail Text Size",
            "단순 TextSize 변경",
            R.layout.motion_02_fail_textsize
        ),
        DemosAdapter.Demo(
            "04. Fail Text Size2",
            "AppbarLayout에서 TextSize 변경 ",
            R.layout.motion_02_fail2_textsize
        ),
        DemosAdapter.Demo(
            "04-2. Scale Text Size2",
            "Scale로 대응한 AppbarLayout에서 TextSize 변경 ",
            R.layout.motion_02_success_textsize
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
