package com.numero.extended_fab_example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_scrolling.*

class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(toolbar)

        fab_label_radio_group.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.use_short_text -> {
                    fab.text = "Example"
                }
                R.id.use_long_text -> {
                    fab.text = "Long Example"
                }
            }
        }
        fab_label_radio_group.check(R.id.use_short_text)
    }
}