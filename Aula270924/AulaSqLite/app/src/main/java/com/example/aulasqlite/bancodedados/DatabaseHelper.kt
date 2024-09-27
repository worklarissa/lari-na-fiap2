package com.example.aulasqlite.bancodedados

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import java.lang.Exception

class DatabaseHelper(context:Context) : SQLiteOpenHelper(
    //1.Context
    //2.Nome do banco de dados
    //3.CursorFactory
    //4.Versão

    context, "Loja", null, 1

) {


    override fun onCreate(db: SQLiteDatabase?) {
        //É executado uma única vez, quando o app é instalado
        val sql = "CREATE TABLE IF NOT EXISTS produtos(" +
                " id_produto INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " titulo VARCHAR(100)," +
                " descricao TEXT" +
                ")"
        try {
            db?.execSQL(sql)
            Log.i("db_info", "Tabela criada com sucesso")
        }catch (e:Exception){
            e.printStackTrace()
            Log.i("bd_info", "Error ao criar tabela")
        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }


}