package com.haero_kim.keepit.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.preference.Preference
import com.haero_kim.keepit.R

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        supportFragmentManager.beginTransaction()
            .replace(R.id.settingFrameLayout, SettingsFragment()).commit()
    }
}