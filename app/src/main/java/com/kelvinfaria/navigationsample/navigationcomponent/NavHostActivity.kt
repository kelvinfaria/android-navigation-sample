package com.kelvinfaria.navigationsample.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kelvinfaria.navigationsample.R
import com.kelvinfaria.navigationsample.databinding.ActivityNavHostBinding
import com.kelvinfaria.navigationsample.intentnavigation.ORIGIN

class NavHostActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavHostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavHostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupView()
    }

    private fun setupView() {
        supportActionBar?.title = getString(R.string.nav_host_activity_text)

        val origin = intent.getStringExtra(ORIGIN)
        binding.activityOriginTextView.text = getString(R.string.coming_from_text, origin)
    }
}