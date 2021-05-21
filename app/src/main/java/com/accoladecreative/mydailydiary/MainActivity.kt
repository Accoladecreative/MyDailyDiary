package com.accoladecreative.mydailydiary

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    val TAGGED = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        title = "Events Diary"

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->

            startActivity(Intent(this,AddEditNote::class.java))
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        GlobalScope.launch {
            getDetailsFromAPI()
            Log.i(TAGGED, "Note:Thread 1: ${Thread.currentThread().name}")
            withContext(Dispatchers.Main){
                Log.i(TAGGED, "Note:Thread 2: ${Thread.currentThread().name}")
            }
        }
        GlobalScope.launch(Dispatchers.IO) {
            getDetailsFromAPI()
            Log.i(TAGGED, "Note:Thread 3: ${Thread.currentThread().name}")
            withContext(Dispatchers.Default){
                Log.i(TAGGED, "Note:Thread 4: ${Thread.currentThread().name}")
            }
        }




    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            R.id.add_event -> {
                startActivity(Intent(this, AddEditNote::class.java))
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }




    }

    //working on the coroutine
    suspend fun getDetailsFromAPI():String{
        val https = "https://www"
        return https

    }
}