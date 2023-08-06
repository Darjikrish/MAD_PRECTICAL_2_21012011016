package com.example.mad_prectical_2_21012011016

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toast(mes:String)
    {
        Toast.makeText(this,mes,Toast.LENGTH_SHORT).show();
    }
    fun snackbar(msg:String)
    {
        Snackbar.make(findViewById(R.id.layout1),msg,Snackbar.LENGTH_SHORT).show();
    }

    override fun onStart() {
        super.onStart()
        Log.i("Activity","on start called")
        snackbar("on start called")
        //toast("on start called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Activity","on resume called")
        snackbar("on resume called")
        //toast("on resume called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Activity","on Pause called")
        snackbar("on Pause called")
        //toast("on Pause called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Activity","on stop called")
        snackbar("on stop called")
        //toast("on stop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Activity","on destroy called")
        snackbar("on destroy called")
        //toast("on destroy called")
    }
}