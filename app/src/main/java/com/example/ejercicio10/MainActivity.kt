package com.example.ejercicio10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Ejercicio #10 Crear un programa que lea un número del usuario
     y determine si es capicúa.*/
    capicua()
    }

    private fun capicua() {

        var numUser = 198

        if (numUser == 202){
            println("$numUser es un numero capicua")

        } else if (numUser != 202) {

            println("$numUser no es igual a 202")

        }else {
            println("$numUser no es capicua ")
        }


    }

}