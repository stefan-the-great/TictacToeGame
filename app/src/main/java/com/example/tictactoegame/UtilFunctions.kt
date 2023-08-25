package com.example.tictactoegame

object UtilFunctions {

    fun validateUserInput (s: String, pNum: Int) :String {
        if (s == "")
            return when(pNum) {
                1 -> "Player One"
                2 -> "Player Two"
                else -> "Player X"
            }

        return s

    }
}

/* Test cases for this class

when input string is empty
when input string is valid
when pNum is 1 and when it is 2 (Only use cases)
when pNum is invalid

*/