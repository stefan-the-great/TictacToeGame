# Tic Tac Toe
*Developed by Stefan Fernando*

# **Table of Contents** {#table-of-contents .TOC-Heading}

Introduction [2](#introduction)

JSP Diagram of the Mobile Application
[3](#jsp-diagram-of-the-mobile-application)

Working features and prototype features
[4](#working-features-and-prototype-features)

Storyboard of the Application
[5](#storyboard-of-the-application)

Problems encountered when developing the mobile application
[6](#problems-encountered-when-developing-the-mobile-application)

Screenshots of the Mobile Application
[7](#screenshots-of-the-mobile-application)

# Introduction

The application developed is a mobile version of the classic game
Tic-Tac-Toe, also known as Noughts and Crosses. The main function of
this application is for two players to play against each other, to see
who will win. Each player will get a symbol, which they will have to
alternatively place on a 3 x 3 grid, and the first player to get three
in a row is the victor.

This application also has a game mode where a single player can play
against the computer. In this mode only the player will have to input a
symbol when it's their turn, after which the computer will play its
turn.

Finally, the winner will be displayed if any player manages to get three
symbols in a row, or a draw will be declared if no player manages to get
three in a row.

# 

# JSP Diagram of the Mobile Application
![image1](https://github.com/stefan-the-great/TictacToeGame/assets/88985961/ffb98452-9578-4f1b-9104-c7df1d47b031)

# Working Features and Prototype Features

Following is a list of all the features and pages of the mobile
application:

1.  Menu System -- Functioning

2.  About Page -- Functioning

3.  Help Page -- Functioning

4.  Home Page -- Functioning

5.  Player vs Player Game mode -- Functioning

6.  Player vs Computer Game mode -- Functioning (with issues)

7.  Add player names -- Functioning

# Storyboard of the Application

![image2](https://github.com/stefan-the-great/TictacToeGame/assets/88985961/3b955ecc-2ef5-4e6f-9cae-67a76958a17b)

![image3](https://github.com/stefan-the-great/TictacToeGame/assets/88985961/59eff6c1-2808-48eb-b849-ac63815d7ff9)

Figure 2.2 -- Story board page 02

# Problems Encountered When Developing the Mobile Application

1.  The android emulator consumed too much system resources. Initially
    the Google Pixel 6 Pro model emulator was used for development,
    which used up an excessive amount of system resources like the RAM.

    a.  This issue was resolved by using the pixel 3a emulator, as it
        uses less resources than the pixel 6 Pro but does come with a
        smaller screen size.

2.  There was an issue with the build.gradle file, where View Binding
    was not working.

    a.  This was resolved by adding the buildFeatures { viewBinding:
        true } property to the build.gradle file.

3.  A function called in the Home fragment to start a game mode was not
    working. Although the function was declared in the relevant fragment
    kotlin file, the function still did not work.

    a.  This was resolved by adding the function to the MainActivity.kt
        file, as this is the parent location of the mentioned fragment.

4.  The buttons on the board were not working. This issue occurred
    because of the View binding issue mentioned earlier. Although that
    issue was fixed, the buttons were still not responsive.

    a.  Used an alternative way to bind the buttons to the codebase,
        which resolved this issue, making the board and its functions
        work perfectly.

5.  Issues with the player vs computer game mode. There is an odd
    behaviour of the game when it is in this mode. Sometimes even when
    player wins, it is displayed as the computer has won, and this game
    mode never displayed that the game was a draw, even though the game
    is clearly shown as a draw. This bug was not fully resolved, but the
    cause of it maybe, that the checks to see if the computer has won,
    runs before the other functions that checks whether a player has
    won.

# 

# Screenshots of the Mobile Application

![image4](https://github.com/stefan-the-great/TictacToeGame/assets/88985961/8bc0c783-be5a-42f5-a881-330c2d32d242)
![image5](https://github.com/stefan-the-great/TictacToeGame/assets/88985961/efa16b45-ace9-48a4-9db2-98edfd863e3f)
![image6](https://github.com/stefan-the-great/TictacToeGame/assets/88985961/5d5d7ce7-529b-48af-affe-040364639d37)
![image7](https://github.com/stefan-the-great/TictacToeGame/assets/88985961/2e4ed524-c913-4577-a0d2-0b058668b450)
![image8](https://github.com/stefan-the-great/TictacToeGame/assets/88985961/622719ba-745a-49f9-abc3-5f8012ed10d6)
![image9](https://github.com/stefan-the-great/TictacToeGame/assets/88985961/64fecf20-5bf7-4165-93c0-b5240e50294e)
![image10](https://github.com/stefan-the-great/TictacToeGame/assets/88985961/b2f9bf0c-f928-4cd8-bc69-0aee57563444)
![image11](https://github.com/stefan-the-great/TictacToeGame/assets/88985961/2fe779ab-01d6-4a80-b804-69772bed0eb4)

