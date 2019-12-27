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
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@ScrollingActivity)
            adapter = ExampleAdapter()
        }
    }
}

class ExampleAdapter : RecyclerView.Adapter<ExampleAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int = 30

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
    }

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view)
}
