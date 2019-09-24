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
        //get an instance of FirebaseRemoteConfig and save the reference in remoteConfig variable

    }

    private fun setSettingsForRemoteConfig() {
        val configSettings = FirebaseRemoteConfigSettings.Builder()
            .setMinimumFetchIntervalInSeconds(0)
            .build()
        //add the settings to remoteConfig

    }

    private fun fetchAndActivateRemoteConfigValue() {
        //fetch and activate remoteConfig, add an CompleteListener,
        // when the task is successful then pass the value to the displayRemoteConfigValue function

    }

    private fun displayRemoteConfigValue(value: String) {
        remoteConfigTextView.text = value
    }


}
