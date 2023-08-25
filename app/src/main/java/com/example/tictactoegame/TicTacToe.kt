package com.example.tictactoegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class TicTacToe : AppCompatActivity()
{
    enum class Turn
    {
        NOUGHT,
        CROSS
    }

    private var currentTurn = Turn.CROSS
    private var counter = 0

    private var boardList = mutableListOf<Button>()

    private lateinit var p1Name: String
    private lateinit var p2Name: String

    private var computerOn = false
    private var availableSquares = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toe)

        initBoard()
    }

    private fun initBoard() {
        when(intent.getStringExtra("gameMode"))
        {
            "PvP" ->
            {
                p1Name = (intent.getStringExtra("p1Name")).toString()
                p2Name = (intent.getStringExtra("p2Name")).toString()
            }
            "PvC" ->
            {
                p1Name = "Player"
                p2Name = "Computer"
                computerOn = true
            }
            else ->
            {
                p1Name = "Player"
                p2Name = "Computer"
            }
        }

        setTurnLabel()
        boardList.add(findViewById(R.id.a1))
        boardList.add(findViewById(R.id.a2))
        boardList.add(findViewById(R.id.a3))
        boardList.add(findViewById(R.id.b1))
        boardList.add(findViewById(R.id.b2))
        boardList.add(findViewById(R.id.b3))
        boardList.add(findViewById(R.id.c1))
        boardList.add(findViewById(R.id.c2))
        boardList.add(findViewById(R.id.c3))

//        Fill out the available squares list for computer's use
        for (button in boardList)
        {
            availableSquares.add(button.id.toString())
        }
    }

    fun boardTapped(view: View)
    {
        if(view !is Button)
            return

        addToBoard(view)

        if(checkForVictory(NOUGHT))
        {
            result(p2Name)
        }

        if(checkForVictory(CROSS))
        {
            result(p1Name)
        }

        if(fullBoard())
        {
            Log.d("TAG", "Arrives at draw")
            result("Draw")
        }

        if(computerOn)
        {
            if (currentTurn == Turn.NOUGHT)
            {
                computerMove()

            }

            if(checkForVictory(NOUGHT))
            {
                result(p2Name)
            }

            else if(fullBoard())
            {
                Log.d("TAG", "Arrives at draw in computer")
                result("Draw")
            }

        }

        else
        {
            setTurnLabel()
//            counter++
        }
    }

    private fun computerMove()
    {
        var currSquare = availableSquares.random()

        for(button in boardList) {
            if (button.id.toString() == currSquare)
            {
                addToBoard(button)
            }
        }
    }

    private fun checkForVictory(s: String): Boolean
    {
//        HORIZONTAL VICTORY
        if(match(findViewById(R.id.a1), s) && match(findViewById(R.id.a2), s) && match(findViewById(R.id.a3), s))
            return true
        if(match(findViewById(R.id.b1), s) && match(findViewById(R.id.b2), s) && match(findViewById(R.id.b3), s))
            return true
        if(match(findViewById(R.id.c1), s) && match(findViewById(R.id.c2), s) && match(findViewById(R.id.c3), s))
            return true

//        VERTICAL VICTORY
        if(match(findViewById(R.id.a1), s) && match(findViewById(R.id.b1), s) && match(findViewById(R.id.c1), s))
            return true
        if(match(findViewById(R.id.a2), s) && match(findViewById(R.id.b2), s) && match(findViewById(R.id.c2), s))
            return true
        if(match(findViewById(R.id.a3), s) && match(findViewById(R.id.b3), s) && match(findViewById(R.id.c3), s))
            return true

//        DIAGONAL VICTORY
        if(match(findViewById(R.id.a1), s) && match(findViewById(R.id.b2), s) && match(findViewById(R.id.c3), s))
            return true
        if(match(findViewById(R.id.a3), s) && match(findViewById(R.id.b2), s) && match(findViewById(R.id.c1), s))
            return true

        return false
    }

    private fun match(button: Button, symbol: String): Boolean = button.text == symbol

    private fun result(title: String)
    {
        if (title == "Draw")
        {
            Intent(this, DrawActivity::class.java)
                .also {
                    it.putExtra("gameMode", intent.getStringExtra("gameMode"))
                    it.putExtra("p1Name", p1Name)
                    it.putExtra("p2Name", p2Name)
                    startActivity(it)
                }
        }
        else {

            Intent(this, ResultActivity::class.java)
                .also {
                    it.putExtra("gameMode", intent.getStringExtra("gameMode"))
                    it.putExtra("winnerName", title)
                    it.putExtra("p1Name", p1Name)
                    it.putExtra("p2Name", p2Name)
                    startActivity(it)
                }
        }
    }

    private fun fullBoard(): Boolean
    {
        if(counter >= 9)
            return true
        Log.d("TAG", "counter: $counter")
        return false
    }

    private fun addToBoard(button: Button)
    {
        if(button.text != "")
            return


        if(currentTurn == Turn.NOUGHT)
        {
            button.text = NOUGHT
            currentTurn = Turn.CROSS
        }

        else if(currentTurn == Turn.CROSS)
        {
            button.text = CROSS
            currentTurn = Turn.NOUGHT
        }

        availableSquares.remove(button.id.toString())
        counter++
    }

    private fun setTurnLabel()
    {

        val textView: TextView = findViewById(R.id.turnTV)

        var turnText = ""
        if (currentTurn == Turn.CROSS)
            turnText = "It's $p1Name's Turn"
        else if (currentTurn == Turn.NOUGHT)
            turnText = "It's $p2Name's Turn"

//        counter++
        textView.text = turnText
    }

    companion object
    {
        const val NOUGHT = "O"
        const val CROSS = "X"
    }
}