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
        storage = FirebaseStorage.getInstance()
    }

    private fun loadAndDisplayImageFromStorage() {
        val gsReference = storage.getReferenceFromUrl("gs://fir-workshop-73598.appspot.com/firebase.png")
        GlideApp.with(this)
            .load(gsReference)
            .into(imageView)
    }

}

