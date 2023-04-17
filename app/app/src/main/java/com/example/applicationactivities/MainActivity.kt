package com.example.applicationactivities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionCallButton: Button = findViewById(R.id.action_call_button)
        val infoToUser: TextView = findViewById (R.id.tvInfoToUser)
        val editNumber: EditText = findViewById(R.id.editNumber)

        infoToUser.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        actionCallButton.setOnClickListener {

            val number = editNumber.text.toString()
            if (number.length == 10) {
                val intent = Intent(this, SecondActivity::class.java)
                Intent(intent)
                intent.putExtra("number", number)
                startActivity(intent);
            } else infoToUser.text = "Введите номер телефона"
        }
    }
}
