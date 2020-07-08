package com.example.lesson6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var aboutapp_TextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(applicationContext, GoodActivity::class.java)
        val intent1 = Intent(applicationContext, ServiсesActivity::class.java)
        when(item.itemId){
            R.id.goods -> startActivity(intent)
            R.id.servises -> startActivity(intent1)
            R.id.about -> aboutapp_TextView?.text = getString(R.string.menu_about)
        }
        return super.onOptionsItemSelected(item)
    }


}