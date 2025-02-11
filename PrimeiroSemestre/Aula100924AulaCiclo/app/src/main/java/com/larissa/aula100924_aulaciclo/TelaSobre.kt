package com.larissa.aula100924_aulaciclo

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaSobre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_sobre)

        var txtResultado:TextView = findViewById(R.id.txtResultado)

        var bundle = intent.extras

        txtResultado.text = bundle?.getString("aluno") + bundle.getInt("rm")
    }
}