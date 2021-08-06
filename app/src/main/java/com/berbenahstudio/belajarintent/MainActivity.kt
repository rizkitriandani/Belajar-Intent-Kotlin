package com.berbenahstudio.belajarintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnIntentExplicit: Button = findViewById(R.id.btnIntentExplicit)

        btnIntentExplicit.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnIntentExplicit ->{
//                Toast.makeText(this, "ANDA MENEKAN TOMBOL ${R.string.intent_explicit}",Toast.LENGTH_SHORT).show()
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intent)
//                startActivity(Intent(this@MainActivity, SecondActivity::class.java))
            }
        }
    }
}