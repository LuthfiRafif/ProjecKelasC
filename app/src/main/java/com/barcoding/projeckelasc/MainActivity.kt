package com.barcoding.projeckelasc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TextView = findViewById<TextView>(R.id.tv_1)

        tv_1.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Hai", Toast.LENGTH_LONG).show()
        })

    }
}
