package com.codeavenge.kidan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.codeavenge.kidan.databinding.ActivityInteractionBinding


class Interaction : AppCompatActivity() {
    private lateinit var binding: ActivityInteractionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInteractionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Navigation bar
        // Reference: https://m3.material.io/components/navigation-bar/implementation
        // TODO: add more button to navigation bar
        loadFragment(TempFragment())
        binding.bottomNavigationView.setOnItemSelectedListener{
            when(it.itemId){
                R.id.tempFragment -> {
                    loadFragment(TempFragment())
                    true
                }
                R.id.settingFragment -> {
                    loadFragment(SettingFragment())
                    true
                }
                else -> false
            }
        }

    }

    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}