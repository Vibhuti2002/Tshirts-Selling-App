package com.myapplication.Authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.myapplication.MainActivity
import com.myapplication.R
import com.myapplication.databinding.ActivityAuthBinding
import com.myapplication.databinding.ActivityMainBinding

class AuthActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        navController.navigate(R.id.loginFragment)

        binding.button.setOnClickListener {
            val     intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}