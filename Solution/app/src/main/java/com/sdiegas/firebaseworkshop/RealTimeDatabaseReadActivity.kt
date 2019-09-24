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
        database = FirebaseDatabase.getInstance()
    }

    private fun initializeRealTimeDatabaseListener() {
        database.getReference("Content").addValueEventListener(object  : ValueEventListener {
            override fun onDataChange(p0: DataSnapshot) {
                val value = p0.getValue(String::class.java)
                value?.let {
                    displayRealTimeDatabaseValue(it)
                }
            }

            override fun onCancelled(p0: DatabaseError) {
                Log.w("FirebaseRealTimeDatabase", p0.toException())
            }
        })
    }

    private fun displayRealTimeDatabaseValue(value: String) {
        realTimeTextView.text = value
    }
}
