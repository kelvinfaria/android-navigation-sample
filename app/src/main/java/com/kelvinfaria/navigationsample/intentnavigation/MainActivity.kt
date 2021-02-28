package com.kelvinfaria.navigationsample.intentnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kelvinfaria.navigationsample.navigationcomponent.NavHostActivity
import com.kelvinfaria.navigationsample.R
import com.kelvinfaria.navigationsample.databinding.ActivityMainBinding

const val ORIGIN = "com.kelvinfaria.navigationsample.ORIGIN"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = getString(R.string.main_activity_text)
        handleNavigateButtonClick()
    }

    private fun handleNavigateButtonClick() {
        binding.navigateButton.setOnClickListener {
            navigateToNavHostActivity()
        }
    }

    private fun navigateToNavHostActivity() {
        val intent = Intent(this, NavHostActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
            putExtra(ORIGIN, getString(R.string.main_activity_text))
        }

        startActivity(intent)
    }
}