package com.example.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var ageInt: EditText
    private lateinit var txtRes: TextView
    private lateinit var btnGen: Button
    private lateinit var btnClr: Button
    private lateinit var exit: Button
    private lateinit var imageView2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ageInt = findViewById(R.id.age)
        txtRes = findViewById(R.id.txtRes)
        btnGen = findViewById(R.id.btnGen)
        btnClr = findViewById(R.id.btnClr)
        exit = findViewById(R.id.exit)
        imageView2 = findViewById(R.id.imageView2)

        btnGen.setOnClickListener {
            handleBtnGen()
        }

        btnClr.setOnClickListener {
            handleBtnClr()
        }

        exit.setOnClickListener {
            handleExit()
        }
    }

    private fun handleBtnGen() {
        // The age entered by the user from the EditText
        val age = ageInt.text.toString()
        if (age.isEmpty()) {
            txtRes.text = "PLEASE ENTER YOUR AGE"
            return

        } else {

            when (ageInt.text.toString().trim().toInt()) {
                20 -> txtRes.text = "You are 20 years old, which is the same age as Pop Smoke when he died."
                27 -> txtRes.text = "You are 27 years old, which is the same age as Jim Morrison when he died."
                32 -> txtRes.text = "You are 32 years old, which is the same age as Bruce Lee when he died."
                36 -> txtRes.text = "You are 36 years old, which is the same age as Marilyn Monroe when she died."
                39 -> txtRes.text = "You are 39 years old, which is the same age as Martin Luther King Jr when he died."
                46 -> txtRes.text = "You are 46 years old, which is the same age as John F Kennedy when he died."
                76 -> txtRes.text = "You are 76 years old, which is the same age as Albert Einstein when he died."
                95 -> txtRes.text = "You are 95 years old, which is the same age as Nelson Mandela when he died."
                87 -> txtRes.text = "You are 87 years old, which is the same age as Mother Teresa when she died."
                100 -> txtRes.text = "You are 100 years old, which is the same age as Bob Hope when he died."


                else -> txtRes.text = "Sorry, no match found!"

            }

        }
    }

    private fun handleBtnClr() {
        // The age entered by the user from the TextView
        ageInt.text.clear()
        txtRes.text = ""
    }

    private fun handleExit() {
        // The user will exit the application
        finish()
    }
}

