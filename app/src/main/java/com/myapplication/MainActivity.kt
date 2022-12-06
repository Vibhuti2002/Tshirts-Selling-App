package com.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.myapplication.Authentication.AuthActivity
import com.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomNav.setupWithNavController(navController)
        binding.button.setOnClickListener {
            val     intent = Intent(applicationContext, AuthActivity::class.java)
            startActivity(intent)
        }
//        navController.addOnDestinationChangedListener { _, destination, _ ->
//            if(destination.id == R.id.fragmentLogin || destination.id == R.id.fragmentSignup) {
//                binding.bottomNavView.visibility = View.GONE
//            } else {
//                binding.bottomNavView.visibility = View.VISIBLE
//            }
//        }
    }
}