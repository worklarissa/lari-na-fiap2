package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var primeiroNumero:TextInputEditText = findViewById(R.id.editPrimeiroNum)
        var segundoNumero:TextInputEditText = findViewById(R.id.editSegundoNum)
        var btnSomar:Button = findViewById(R.id.btnSomar)
        var txtResultado:TextView = findViewById(R.id.txtResultado)
        var imageCalc:ImageView = findViewById(R.id.imageCalc)

        btnSomar.setOnClickListener {
            var resultado = primeiroNumero.text.toString().toDouble() + segundoNumero.text.toString().toDouble()
            txtResultado.setText("O Resusltado da soma é: ${resultado}")
        }

        imageCalc.setOnClickListener {
            txtResultado.setText("Imagem clicada")
        }

        }
}
