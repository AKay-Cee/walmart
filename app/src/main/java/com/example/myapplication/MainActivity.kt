package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun goToProductListActivity(productList: ArrayList<Product>) {
        val intent = Intent(this, ItemListActivity::class.java)
        intent.putExtra("productList", Gson().toJson(productList))
        startActivity(intent)
    }

    fun onElectronicClicked(view: View) {
        val electronicItemList = ArrayList<Product>()

        val product1 = Product(
            "ESP32",
            75.50,
            "Black",
            "https://www.mouser.com/images/espressifsystems/lrg/ESP32-DevKitC-32UE_SPL.jpg",
            "Elx01",
            "feature-rich MCU with integrated Wi-Fi and Bluetooth connectivity for a wide-range of applications"
        )

        val product2 = Product(
            "Lenovo Laptop",
            1020.50,
            "Silver",
            "https://i5.walmartimages.com/asr/d800c7e3-44be-450b-a469-ede1232d66d3.c0c524f67b85c0830096a76876462aa6.jpeg",
            "COM25",
            "9th generation i7 processor and 16GB RAM."
        )

        val product3 = Product(
            "BeagleBone Blue",
            950.00,
            "Blue",
            "https://beagleboard.org/static/images/600px/beagle-blue-pck.png",
            "Elx05",
            "all-in-one Linux-based computer for robotics, integrating onto a single small  board the Octavo OSD3358 microprocessor together with wifi/bluetooth"
        )

        val product4 = Product(
            "HP ZBook",
            2300.00,
            "Grey",
            "https://support.hp.com/doc-images/626/c06683803.png",
            "COM06",
            "Very Strong Mobile Workstation"
        )

        val product5 = Product(
            "LG Television",
            230.00,
            "Black",
            "https://www.lg.com/us/images/tvs/md07503790/gallery/desktop-01.jpg",
            "Elx 10",
            "Ultra slim 4K television"
        )
        val product6 = Product(
            "3D projector",
            120.50,
            "White",
            "https://www.projectorcentral.com/img.cfm?pid=6511&w=200",
            "Elx 15",
            "3D Projector with accessories"
        )

        electronicItemList.add(product1)
        electronicItemList.add(product2)
        electronicItemList.add(product3)
        electronicItemList.add(product4)
        electronicItemList.add(product5)
        electronicItemList.add(product6)

        goToProductListActivity(electronicItemList)

    }

    fun onClothingClicked(view: View) {
        val clothingItemList = ArrayList<Product>()
    }

    fun onBeautyClicked(view: View) {
        val beautyItemList = ArrayList<Product>()
    }

    fun onFoodClicked(view: View) {
        val foodItemList = ArrayList<Product>()
    }


}


