package com.proyek.usahamaju.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.proyek.usahamaju.R
import com.proyek.usahamaju.databinding.ActivityMainBinding


class LoginScreen : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val button = findViewById<Button>(R.id.btlogin)
        setContentView(R.layout.activity_login_screen)

    }
}