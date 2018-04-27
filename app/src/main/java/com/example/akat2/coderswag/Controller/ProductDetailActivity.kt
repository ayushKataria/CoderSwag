package com.example.akat2.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.akat2.coderswag.Model.Product
import com.example.akat2.coderswag.R
import com.example.akat2.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    lateinit var product: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        product = intent.getParcelableExtra(EXTRA_PRODUCT)

        val resourceId = resources.getIdentifier(product.image, "drawable", packageName)
        productImage.setImageResource(resourceId)
        productTitle.text = product.title
        productPrice.text = product.price
        productDescription.text = product.description
    }
}
