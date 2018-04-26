package com.example.akat2.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.akat2.coderswag.Model.Product
import com.example.akat2.coderswag.R

/**
 * Created by Ayush Kataria on 27-04-2018.
 */
class ProductsAdapter(val context: Context, val products: List<Product>) : RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(products[position])
    }

    inner class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productTitle = itemView?.findViewById<TextView>(R.id.productTitle)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product: Product){
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productTitle?.text = product.title
            productPrice?.text = product.price
        }
    }
}