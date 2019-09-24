package com.sdiegas.firebaseworkshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_real_time_database_write.*

class RealTimeDatabaseWriteActivity : AppCompatActivity() {

    lateinit var database : FirebaseDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_real_time_database_write)
        initzializeDatabase()
        nextExercise.setOnClickListener {
            writeValueToDatabase()
            startActivity(Intent(this, RealTimeDatabaseReadActivity::class.java))
        }
    }

    private fun initzializeDatabase() {
        database = FirebaseDatabase.getInstance()
    }

    private fun writeValueToDatabase() {
        database.getReference("Content").setValue(editText.text.toString())
    }
}
