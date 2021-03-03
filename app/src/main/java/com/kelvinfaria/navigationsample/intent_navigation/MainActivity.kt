package com.kelvinfaria.navigationsample.intent_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kelvinfaria.navigationsample.navigation_component.NavHostActivity
import com.kelvinfaria.navigationsample.R
import com.kelvinfaria.navigationsample.data.NavigationObject
import com.kelvinfaria.navigationsample.databinding.ActivityMainBinding
import com.kelvinfaria.navigationsample.intent_navigation.utils.startSingleTopActivity


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainActivityText: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainActivityText = getString(R.string.main_activity)
        supportActionBar?.title = mainActivityText

        handleButtonClick()
    }

    private fun handleButtonClick() {
        binding.navigateToFragmentHostActivityButton.setOnClickListener {
            startSingleTopActivity<FragmentHostActivity>(
                NavigationObject(
                    mainActivityText,
                    getString(R.string.intent)
                )
            )
        }

        binding.navigateToNavHostActivityButton.setOnClickListener {
            startSingleTopActivity<NavHostActivity>(mainActivityText)
        }
    }
}