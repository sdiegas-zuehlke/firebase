package com.sdiegas.firebaseworkshop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_storage.*


class StorageActivity : AppCompatActivity() {

    lateinit var storage: FirebaseStorage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_storage)
        getStorageObject()
        loadAndDisplayImageFromStorage()
    }

    private fun getStorageObject() {
        //get an instance of FirebaseStorage and save the reference in storage variable
    }

    private fun loadAndDisplayImageFromStorage() {
        //get a reference to the image uploaded to firebase, should start with gs://
        //Use glide to load the reference into the imageView
    }

}

