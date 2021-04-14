package com.littlegod.sampletv

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        activity_register_button_send.setOnClickListener {
            Toast.makeText(this, "Button click", Toast.LENGTH_LONG).show()
        }

    }
}