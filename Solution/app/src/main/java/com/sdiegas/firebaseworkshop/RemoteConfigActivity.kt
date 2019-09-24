package com.sdiegas.firebaseworkshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings
import kotlinx.android.synthetic.main.activity_main.*

class RemoteConfigActivity : AppCompatActivity() {

    lateinit var remoteConfig: FirebaseRemoteConfig

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getRemoteConfigObject()
        setSettingsForRemoteConfig()
        fetchAndActivateRemoteConfigValue()
        nextActivity.setOnClickListener {
            startActivity(Intent(this, RealTimeDatabaseWriteActivity::class.java))
        }
    }

    private fun getRemoteConfigObject() {
        remoteConfig = FirebaseRemoteConfig.getInstance()
    }

    private fun setSettingsForRemoteConfig() {
        val configSettings = FirebaseRemoteConfigSettings.Builder()
            .setMinimumFetchIntervalInSeconds(0)
            .build()
        remoteConfig.setConfigSettingsAsync(configSettings)
    }

    private fun fetchAndActivateRemoteConfigValue() {
        remoteConfig.fetchAndActivate()
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val value = remoteConfig.getString("FirebaseWorkshopParameter")
                    displayRemoteConfigValue(value)
                }
            }
    }

    private fun displayRemoteConfigValue(value: String) {
        remoteConfigTextView.text = value
    }


}
