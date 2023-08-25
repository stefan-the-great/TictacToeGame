package com.example.tictactoegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class PlayerOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_one)
    }

    fun playerTwo(view: View)
    {
        val name = findViewById<EditText>(R.id.p1NameET)

        val p1Name = UtilFunctions.validateUserInput(name.text.toString(), 1)

        Intent(this, PlayerTwo::class.java)
            .also {
                it.putExtra("p1Name", p1Name)

                startActivity(it)
            }

    }
}
