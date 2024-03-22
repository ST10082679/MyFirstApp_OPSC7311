package com.example.myfirstapp_opsc7311

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myfirstapp_opsc7311.databinding.ActivityOrderDetailsBinding



class OrderDetailsActivity : AppCompatActivity() {
    var orders = Order()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val binding = ActivityOrderDetailsBinding.inflate(layoutInflater)

        orders.productName = intent.getStringExtra("order").toString()

        binding.PlaceOrderTxt.text = orders.productName

        when(orders.productName)
        {
            "Soy Latte" -> binding.imageView3.setImageResource(R.drawable.sb1)
            "Chocco Frapp" -> binding.imageView3.setImageResource(R.drawable.sb2)
            "Bottled Americano" -> binding.imageView3.setImageResource(R.drawable.sb3)
            "Rainbow Frapp" -> binding.imageView3.setImageResource(R.drawable.sb4)
            "Carmel Latte" -> binding.imageView3.setImageResource(R.drawable.sb5)
            "Black Forest Frapp" -> binding.imageView3.setImageResource(R.drawable.sb6)
        }


        setContentView(R.layout.activity_order_details)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}