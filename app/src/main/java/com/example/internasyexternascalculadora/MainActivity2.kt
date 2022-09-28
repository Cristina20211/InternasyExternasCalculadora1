package com.example.internasyexternascalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private var lvlenguajes: ListView? = null
    private var tvSeleccion: TextView? = null

    private val lenguajes = arrayOf("Kotlin ", "Java", "C++", "C#", "PHP", "VB.net")
    private val posicion = arrayOf("1", "6", "3", "2", "4", "5")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
      

        lvlenguajes = findViewById(R.id.lvlenguajes)
        tvSeleccion = findViewById(R.id.tvSeleccion)

        var adaptador: ArrayAdapter<String> = ArrayAdapter<String>(this, R.layout.activity_main2)
        lvlenguajes?.adapter = adaptador


        lvlenguajes?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                tvSeleccion?.text =
                    "La posicion del lenguaje ${lvlenguajes?.getItemAtPosition(position)} es ${posicion[position]} "

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }
}