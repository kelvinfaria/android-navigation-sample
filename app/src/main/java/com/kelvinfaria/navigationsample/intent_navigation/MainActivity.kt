package com.kelvinfaria.navigationsample.intent_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kelvinfaria.navigationsample.navigation_component.NavHostActivity
import com.kelvinfaria.navigationsample.R
import com.kelvinfaria.navigationsample.databinding.ActivityMainBinding
import com.kelvinfaria.navigationsample.intent_navigation.utils.startSingleTopActivity


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var originText: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = getString(R.string.main_activity_text)
        originText = getString(R.string.main_activity_text)
        handleButtonClick()
    }

    private fun handleButtonClick() {
        binding.navigateToFragmentHostActivityButton.setOnClickListener {
            startSingleTopActivity<FragmentHostActivity>(originText)
        }

        binding.navigateToNavHostActivityButton.setOnClickListener {
            startSingleTopActivity<NavHostActivity>(originText)
        }
    }
}