package com.sdiegas.firebaseworkshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_real_time_database_read.*

class RealTimeDatabaseReadActivity : AppCompatActivity() {

    lateinit var database : FirebaseDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_real_time_database_read)
        initzializeDatabase()
        initializeRealTimeDatabaseListener()
        nextExercise.setOnClickListener {
            startActivity(Intent(this, StorageActivity::class.java))
        }
    }

    private fun initzializeDatabase() {
        //get an instance of FirebaseDatabase and save the reference in databse variable
    }

    private fun initializeRealTimeDatabaseListener() {
        //get a reference from database with the path defined in the previous task
        //add an addValueEventListener and override the both functions onDataChange and onCancelled
        //call the displayRealTimeDatabaseValue everytime the data Changes
        //we now are able to modify the values in Firebase and directly see the changes -> Realtime :)

    }

    private fun displayRealTimeDatabaseValue(value: String) {
        realTimeTextView.text = value
    }
}
