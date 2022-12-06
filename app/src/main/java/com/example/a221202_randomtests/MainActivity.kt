package com.example.a221202_randomtests

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.copy -> {
                Toast.makeText(this, "Copied to clipboard", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.share -> {
                Toast.makeText(this, "Link shared", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.settings -> {
                val intent=Intent(this, MainActivity2::class.java)
                startActivity(intent)
                return true
            }
            R.id.info -> {
                val intent=Intent(this, MainActivity3::class.java)
                startActivity(intent)
                return true
            }
            else ->
            return super.onOptionsItemSelected(item)
        }
    }
}