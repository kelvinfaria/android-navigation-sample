package com.kelvinfaria.navigationsample.navigation_component.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kelvinfaria.navigationsample.R
import com.kelvinfaria.navigationsample.databinding.ActivityNavHostBinding
import com.kelvinfaria.navigationsample.intent_navigation.utils.ORIGIN

class NavHostActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavHostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavHostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = getString(R.string.nav_host_activity)
    }
}