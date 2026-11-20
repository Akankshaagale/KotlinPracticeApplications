
package com.example.studentregistration

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.etName)
        val email = findViewById<EditText>(R.id.etEmail)
        val phone = findViewById<EditText>(R.id.etPhone)
        val button = findViewById<Button>(R.id.btnRegister)

        button.setOnClickListener {

            val studentName = name.text.toString().trim()
            val studentEmail = email.text.toString().trim()
            val studentPhone = phone.text.toString().trim()

            if (studentName.isEmpty() ||
                studentEmail.isEmpty() ||
                studentPhone.isEmpty()) {

                Toast.makeText(
                    this,
                    "Please fill all fields",
                    Toast.LENGTH_SHORT
                ).show()

            } else if (!android.util.Patterns.EMAIL_ADDRESS
                    .matcher(studentEmail).matches()) {

                Toast.makeText(
                    this,
                    "Enter valid email",
                    Toast.LENGTH_SHORT
                ).show()

            } else if (!studentPhone.matches(Regex("[0-9]{10}"))) {

                Toast.makeText(
                    this,
                    "Enter valid 10 digit phone number",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                Toast.makeText(
                    this,
                    "Registration Successful!",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}
