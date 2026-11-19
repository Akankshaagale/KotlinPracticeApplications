
package com.example.fruitlistapplication

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        val fruit1 = findViewById<TextView>(R.id.fruit1)
        val fruit2 = findViewById<TextView>(R.id.fruit2)
        val fruit3 = findViewById<TextView>(R.id.fruit3)
        val fruit4 = findViewById<TextView>(R.id.fruit4)
        val fruit5 = findViewById<TextView>(R.id.fruit5)


        fruit1.setOnClickListener {
            Toast.makeText(this, "You selected Apple", Toast.LENGTH_SHORT).show()
        }

        fruit2.setOnClickListener {
            Toast.makeText(this, "You selected Banana", Toast.LENGTH_SHORT).show()
        }

        fruit3.setOnClickListener {
            Toast.makeText(this, "You selected Grapes", Toast.LENGTH_SHORT).show()
        }

        fruit4.setOnClickListener {
            Toast.makeText(this, "You selected Mango", Toast.LENGTH_SHORT).show()
        }

        fruit5.setOnClickListener {
            Toast.makeText(this, "You selected Orange", Toast.LENGTH_SHORT).show()
        }
    }
}
