package com.example.akat2.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.akat2.coderswag.Model.Category
import com.example.akat2.coderswag.R

/**
 * Created by Ayush Kataria on 06-04-2018.
 */
class CategoryAdapter(context: Context, categories: List<Category>): BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View

        categoryView = LayoutInflater.from(context).inflate(R.layout.categories_list_item, null)
        val categoryImage: ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName: TextView = categoryView.findViewById(R.id.categoryName)

        val category = categories.get(position)

        categoryName.text = category.title

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)
        println(resourceId)

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
}