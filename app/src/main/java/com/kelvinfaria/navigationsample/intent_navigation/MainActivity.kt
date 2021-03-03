package com.kelvinfaria.navigationsample.intent_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kelvinfaria.navigationsample.navigation_component.activity.NavHostActivity
import com.kelvinfaria.navigationsample.R
import com.kelvinfaria.navigationsample.data.NavigationObject
import com.kelvinfaria.navigationsample.databinding.ActivityMainBinding
import com.kelvinfaria.navigationsample.intent_navigation.utils.startSingleTopActivity


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navigationObject: NavigationObject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigationObject = NavigationObject(
            getString(R.string.main_activity),
            getString(R.string.intent)
        )
        supportActionBar?.title = getString(R.string.main_activity)

        handleButtonClick()
    }

    private fun handleButtonClick() {
        binding.navigateToFragmentHostActivityButton.setOnClickListener {
            startSingleTopActivity<FragmentHostActivity>(navigationObject)
        }

        binding.navigateToNavHostActivityButton.setOnClickListener {
            startSingleTopActivity<NavHostActivity>(navigationObject)
        }
    }
}