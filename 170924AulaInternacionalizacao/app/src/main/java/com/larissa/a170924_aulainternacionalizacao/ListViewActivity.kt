package com.larissa.a170924_aulainternacionalizacao

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListViewActivity : AppCompatActivity() {

    private lateinit var listViewAlunos:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        
        val listaDeAluno = listOf("Murillo", "Luna", "Atila", "William", "Daniel", "Glenda")

        listViewAlunos.findViewById(R.id.ListViewFiap)

        listViewAlunos.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            listaDeAluno
        )

    }
}