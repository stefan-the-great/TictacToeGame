package com.example.tictactoegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        getIntentData()
    }

    private fun getIntentData (){
        val winnerName: TextView = findViewById(R.id.playerNameTV)
        val winner = intent.getStringExtra("winnerName")

        winnerName.text = winner
    }

    fun playAgain(view: View)
    {
        val p1Name = intent.getStringExtra("p1Name")
        val p2Name = intent.getStringExtra("p2Name")
        val gameMode = intent.getStringExtra("gameMode")

        Intent(this, TicTacToe::class.java)
            .also {
//                Starting player is switched
                if (gameMode == "PvP")
                {
                    it.putExtra("gameMode", gameMode)
                    it.putExtra("p1Name", p2Name.toString())
                    it.putExtra("p2Name", p1Name.toString())
                }
                else
                {
                    it.putExtra("gameMode", gameMode)
                    it.putExtra("p1Name", p1Name.toString())
                    it.putExtra("p2Name", p2Name.toString())
                }
                startActivity(it)
            }
    }
    fun mainMenu(view: View)
    {
        Intent(this, MainActivity::class.java)
            .also {
                startActivity(it)
            }

    }
}