package com.codeavenge.kidan

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.codeavenge.kidan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener{
            val toast = Toast.makeText(this, "English", Toast.LENGTH_SHORT)
            toast.show()
        }

        binding.btn2.setOnClickListener{
            val toast = Toast.makeText(this, "Bengali", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}
