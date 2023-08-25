package com.example.tictactoegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class PlayerTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_two)

    }

    fun startTicTacToe(view: View)
    {
        val p1Name = intent.getStringExtra("p1Name")
        val name = findViewById<EditText>(R.id.p2NameET)

        val p2Name = UtilFunctions.validateUserInput(name.text.toString(), 2)

        Intent(this, TicTacToe::class.java)
            .also {
                it.putExtra("gameMode", "PvP")
                it.putExtra("p1Name", p1Name)
                it.putExtra("p2Name", p2Name)

                startActivity(it)
            }


    }
}