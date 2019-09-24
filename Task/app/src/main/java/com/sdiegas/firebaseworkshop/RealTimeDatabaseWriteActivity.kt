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
        //get an instance of FirebaseDatabase and save the reference in databse variable

    }

    private fun writeValueToDatabase() {
        //get the value from the editText and set the value in FirebaseDatabase

    }
}
