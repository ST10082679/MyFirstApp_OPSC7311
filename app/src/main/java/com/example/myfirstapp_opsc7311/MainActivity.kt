package com.example.myfirstapp_opsc7311

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myfirstapp_opsc7311.databinding.ActivityMainBinding
import com.example.myfirstapp_opsc7311.databinding.ActivityMainWithNavDrawerBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var order = Order()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainWithNavDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView.setOnClickListener(this)
        binding.imgSb1.setOnClickListener(this)
        binding.imgSb2.setOnClickListener(this)
        binding.imgSb3.setOnClickListener(this)
        binding.imgSb4.setOnClickListener(this)
        binding.imgSb5.setOnClickListener(this)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.imageView -> order.productName = "Soy Latte"
            R.id.img_sb1 -> order.productName = "Chocco Frap"
            R.id.img_sb2 -> order.productName = "Bottled Americano"
            R.id.img_sb3 -> order.productName = "Rainbow Frapp"
            R.id.img_sb4 -> order.productName = "Caramel Frapp"
            R.id.img_sb5 -> order.productName = "Black Forest Frapp"
        }

        Toast.makeText(this@MainActivity, "MMM" + order.productName, Toast.LENGTH_SHORT).show()

        openIntent(this, order.productName, OrderDetailsActivity::class.java)
    }
}


