package com.larissa.aula100924_aulaciclo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnSobre: Button = findViewById(R.id.btnSobre)

        btnSobre.setOnClickListener{
            var navegarSobre= Intent(this, TelaSobre::class.java)

            navegarSobre.putExtra("aluno","Pedro")
            navegarSobre.putExtra("rm","551029")

            //Passando a intent para o método para abrir a activity
            startActivity(navegarSobre)
        }


    }

    override fun onStart(){
        super.onStart()
        Log.i("cicloVida", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i("cicloVida", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("cicloVida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("cicloVida", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("cicloVida", "onDestroy")
    }

}