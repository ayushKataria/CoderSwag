package com.example.akat2.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.akat2.coderswag.Adapters.CategoryAdapter
import com.example.akat2.coderswag.Model.Category
import com.example.akat2.coderswag.R
import com.example.akat2.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,
                DataService.categories)
        categoryListView.adapter = adapter
    }
}
