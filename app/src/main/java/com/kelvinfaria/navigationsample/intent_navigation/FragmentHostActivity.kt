package com.kelvinfaria.navigationsample.intent_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kelvinfaria.navigationsample.R
import com.kelvinfaria.navigationsample.data.NavigationObject
import com.kelvinfaria.navigationsample.databinding.ActivityFragmentHostBinding
import com.kelvinfaria.navigationsample.intent_navigation.utils.ORIGIN

class FragmentHostActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFragmentHostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentHostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = getString(R.string.fragment_host_activity)
        setupView()
    }

    private fun setupView() {

        val navigationObject = intent.getParcelableExtra(ORIGIN) ?: NavigationObject.EMPTY
        binding.navigationOriginTextView.text = getString(
            R.string.coming_from, navigationObject.navigationOrigin
        )
        binding.navigationTypeTextView.text = getString(
            R.string.navigation_type, navigationObject.navigationType
        )
    }
}