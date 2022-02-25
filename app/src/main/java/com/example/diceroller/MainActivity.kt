package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Esta actividad permite realizar una tirada a un dado
 * y mostrarlo por pantalla
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Tira el dado y lo muestra por pantalla
     */
    private fun rollDice() {
        // Busco el textview
        val resultTextView: TextView = findViewById(R.id.textView)
        // Creo un objecto con 6 caras realizo la tirada y actualizo
        resultTextView.text = Dice(6).roll().toString()

    }

    class Dice(private val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}