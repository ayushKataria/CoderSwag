package com.example.akat2.coderswag.Services

import com.example.akat2.coderswag.Model.Category
import com.example.akat2.coderswag.Model.Product

/**
 * Created by Ayush Kataria on 05-04-2018.
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1", "This is a description of the item."),
            Product("Devslopes Hat Black", "$20", "hat2", "This is a description of the item."),
            Product("Devslopes Hat White", "$18", "hat3", "This is a description of the item."),
            Product("Devslopes Hat Snapback", "$22", "hat4", "This is a description of the item."),
            Product("Devslopes Graphic Beanie", "$18", "hat1", "This is a description of the item."),
            Product("Devslopes Hat Black", "$20", "hat2", "This is a description of the item."),
            Product("Devslopes Hat White", "$18", "hat3", "This is a description of the item."),
            Product("Devslopes Hat Snapback", "$22", "hat4", "This is a description of the item."),
            Product("Devslopes Graphic Beanie", "$18", "hat1", "This is a description of the item."),
            Product("Devslopes Hat Black", "$20", "hat2", "This is a description of the item."),
            Product("Devslopes Hat White", "$18", "hat3", "This is a description of the item."),
            Product("Devslopes Hat Snapback", "$22", "hat4", "This is a description of the item.")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie1", "This is a description of the item."),
            Product("Devslopes Hoodie Red", "$32", "hoodie2", "This is a description of the item."),
            Product("Devslopes Gray Hoodie", "$28", "hoodie3", "This is a description of the item."),
            Product("Devslopes Black Hoodie", "$32", "hoodie4", "This is a description of the item."),
            Product("Devslopes Hoodie Gray", "$28", "hoodie1", "This is a description of the item."),
            Product("Devslopes Hoodie Red", "$32", "hoodie2", "This is a description of the item."),
            Product("Devslopes Gray Hoodie", "$28", "hoodie3", "This is a description of the item."),
            Product("Devslopes Black Hoodie", "$32", "hoodie4", "This is a description of the item."),
            Product("Devslopes Hoodie Gray", "$28", "hoodie1", "This is a description of the item."),
            Product("Devslopes Hoodie Red", "$32", "hoodie2", "This is a description of the item."),
            Product("Devslopes Gray Hoodie", "$28", "hoodie3", "This is a description of the item."),
            Product("Devslopes Black Hoodie", "$32", "hoodie4", "This is a description of the item.")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt1", "This is a description of the item."),
            Product("Devslopes Badge Light Gray", "$20", "shirt2", "This is a description of the item."),
            Product("Devslopes Logo Shirt Red", "$22", "shirt3", "This is a description of the item."),
            Product("Devslopes Hustle", "$22", "shirt4", "This is a description of the item."),
            Product("Kickflip Studios", "$18", "shirt5", "This is a description of the item."),
            Product("Devslopes Shirt Black", "$18", "shirt1", "This is a description of the item."),
            Product("Devslopes Badge Light Gray", "$20", "shirt2", "This is a description of the item."),
            Product("Devslopes Logo Shirt Red", "$22", "shirt3", "This is a description of the item."),
            Product("Devslopes Hustle", "$22", "shirt4", "This is a description of the item."),
            Product("Kickflip Studios", "$18", "shirt5", "This is a description of the item."),
            Product("Devslopes Shirt Black", "$18", "shirt1", "This is a description of the item."),
            Product("Devslopes Badge Light Gray", "$20", "shirt2", "This is a description of the item."),
            Product("Devslopes Logo Shirt Red", "$22", "shirt3", "This is a description of the item."),
            Product("Devslopes Hustle", "$22", "shirt4", "This is a description of the item."),
            Product("Kickflip Studios", "$18", "shirt5", "This is a description of the item.")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }
}