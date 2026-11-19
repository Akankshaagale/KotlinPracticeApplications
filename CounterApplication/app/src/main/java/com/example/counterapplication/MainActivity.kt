
package com.example.counterapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtCount = findViewById<TextView>(R.id.txtCount)
        val btnIncrease = findViewById<Button>(R.id.btnIncrease)
        val btnDecrease = findViewById<Button>(R.id.btnDecrease)
        val btnReset = findViewById<Button>(R.id.btnReset)

        btnIncrease.setOnClickListener {
            count++
            txtCount.text = count.toString()
        }

        btnDecrease.setOnClickListener {
            count--
            txtCount.text = count.toString()
        }

        btnReset.setOnClickListener {
            count = 0
            txtCount.text = count.toString()
        }
    }
}
