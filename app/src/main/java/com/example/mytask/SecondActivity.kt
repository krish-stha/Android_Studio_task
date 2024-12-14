package com.example.myapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mytask.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        val emailText = findViewById<TextView>(R.id.emailText)
        val genderText = findViewById<TextView>(R.id.genderText)
        val countryText = findViewById<TextView>(R.id.countryText)
        val cityText = findViewById<TextView>(R.id.cityText)

        val fullName = intent.getStringExtra("fullName")
        val email = intent.getStringExtra("email")
        val gender = intent.getStringExtra("gender")
        val country = intent.getStringExtra("country")
        val city = intent.getStringExtra("city")

        welcomeText.text = "Welcome, $fullName"
        emailText.text = "Email: $email"
        genderText.text = "Gender: $gender"
        countryText.text = "Country: $country"
        cityText.text = "City: $city"
    }
}
