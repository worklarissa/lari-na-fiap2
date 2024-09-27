package com.example.aulasqlite

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aulasqlite.bancodedados.DatabaseHelper
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private val bancoDados by lazy{
        DatabaseHelper(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        try{
            bancoDados.writableDatabase.execSQL("INSERT INTO produtos VALUES(null, 'Celular Apple', '512gb')")
            Log.i("db_info", "Registro salvo")
        }catch(e:Exception){
            e.printStackTrace()
        }

    }
}