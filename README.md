# Tic Tac Toe
*Developed by Stefan Fernando*

# **Table of Contents** {#table-of-contents .TOC-Heading}

Introduction [2]

JSP Diagram of the Mobile Application
[3]

Testing of the Mobile Application
[4]

Working features and prototype features
[6]

Storyboard of the Application
[7]

Problems encountered when developing the mobile application
[8]

Screenshots of the Mobile Application
[10]

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

![](vertopal_850ca4026a95469cb4915a42b83d456d/media/image1.png){width="10.240277777777777in"
height="3.9347222222222222in"}

Figure 1 JSP Diagram

# Testing of the Mobile Application

Include test Cases and document them. Test almost **all** the features.
Unit testing and functional testing would be sufficient. However,
testing is very important. A sample test case would look like the below.
Create test cases for all the functions in your mobile application

  ---------------------------------------------------------------------------------
  Test     Description    Inputs        Expected Output  Actual Output    Status
  Case                                                                    
  Number                                                                  
  -------- -------------- ------------- ---------------- ---------------- ---------
  01       Testing the    1\. Valid     1\. Set input as 1\. Set input as Pass
           player 1 user  name provided p1Name and move  p1Name and move  
           input                        to next screen   to next screen   

                          2\. Empty     2\. Set p1Name   2\. Set p1Name   Pass
                          input         as 'Player One'  as 'Player One'  
                          provided                                        

  02       Testing the    1\. Valid     1\. Set input as 1\. Set input as Pass
           player 2 user  name provided p2Name and move  p1Name and move  
           input                        to Game screen   to Game screen   

                          2\. Empty     2\. Set p2Name   2\. Set p2Name   Pass
                          input         as 'Player Two'  as 'Player Two'  
                          provided                                        

  03       Testing        1\. With two  1\. Show the     1\. Show the     Pass
           current player valid player  player names     player names     
           display text   names         alternatively,   alternatively,   
                                        depending on     depending on     
                                        turn             turn             

                          2\. With one  2\. Show valid   2\. Show valid   Pass
                          valid name    name as normal,  name as normal,  
                          and one empty replace empty    replace empty    
                          name          name with        name with        
                                        'Player One/Two' 'Player One/Two' 

  04       Testing UI on  1\. on the    1\. All UI       1\. All UI       Pass
           different      Google Pixel  components       components are   
           phone models   3a            visible          visible          

                          2\. on the    2\. All UI       2\. All UI       Pass
                          Google Pixel  components       components are   
                          6 Pro         visible          visible          

  05       Testing the    1\.           1\. return true  1\. return true  Pass
           match() method button.text =                                   
           in             'X' and s =                                     
           TicTacToe.kt   'X'                                             

                          2\.           2\. return false 2\. return false Pass
                          button.text =                                   
                          'X' and s =                                     
                          'O'                                             

  06       Testing the vs 1\. play a    1\. after game   1\. after game   Pass
           Computer mode  game where    ends, should     ends, player is  
                          the player    display player   displayed as the 
                          should win    as the winner in winner in result 
                                        result screen    screen           

                          2\. play a    2\. after game   2\. after game   Pass
                          game where    ends, should     ends, computer   
                          the computer  display computer is displayed as  
                          should win    as the winner in the winner in    
                                        result screen    result screen    

                          2\. play a    2\. after game   2\. after game   Fail
                          game to a     ends, should     ends, a random   
                          draw          display draw in  winner is        
                                        result screen    displayed as the 
                                                         winner in result 
                                                         screen           

  07       Testing Player 1\. play a    1\. after game,  1\. after game,  Pass
           vs Player mode game where p1 p1 name is       p1 name is       
                          wins          displayed as the displayed as the 
                                        winner in result winner in result 
                                        screen           screen           

                          2\. play a    1\. after game,  1\. after game,  Pass
                          game where p2 p2 name is       p2 name is       
                          wins          displayed as the displayed as the 
                                        winner in result winner in result 
                                        screen           screen           

                          3\. play a    3\. after game,  3\. after game,  Pass
                          game to a     draw result is   draw result is   
                          draw          displayed in     displayed in     
                                        result screen    result screen    

  08       Testing Play   1\. after any 1\. board should 1\. board is     Pass
           again button   game, play    be reset, and if reset, and if    
                          again button  PvP mode,        PvP mode,        
                          is clicked    players are      players are      
                                        swapped          swapped          

  09       Testing return 1\. button is 1\. returns to   1\. returns to   Pass
           to Main Menu   clicked after Home screen      Home screen      
           button         game                                            

  10       Testing        1\. Home menu 1\. shows home   1\. shows home   Pass
           Navigation     item is       screen           screen           
                          clicked                                         

                          2\. About     2\. shows about  2\. shows about  Pass
                          menu item is  screen           screen           
                          clicked                                         

                          3\. Help menu 2\. shows help   3\. shows help   Pass
                          item is       screen           screen           
                          clicked                                         
  ---------------------------------------------------------------------------------

(Failed because we expected a draw result, but with tests the winner
result was displayed with a seemingly random winner)

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

![](vertopal_850ca4026a95469cb4915a42b83d456d/media/image2.png){width="6.5in"
height="7.386805555555555in"}

Figure 2.1 -- Story board page 01

![](vertopal_850ca4026a95469cb4915a42b83d456d/media/image3.png){width="6.5in"
height="2.8493055555555555in"}

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

![](vertopal_850ca4026a95469cb4915a42b83d456d/media/image4.png){width="2.3069444444444445in"
height="5.0in"}![](vertopal_850ca4026a95469cb4915a42b83d456d/media/image5.png){width="2.3069444444444445in"
height="5.0in"}![](vertopal_850ca4026a95469cb4915a42b83d456d/media/image6.png){width="2.3069444444444445in"
height="5.0in"}

![](vertopal_850ca4026a95469cb4915a42b83d456d/media/image7.png){width="2.307638888888889in"
height="5.0in"}![](vertopal_850ca4026a95469cb4915a42b83d456d/media/image8.png){width="2.3069444444444445in"
height="5.0in"}![](vertopal_850ca4026a95469cb4915a42b83d456d/media/image9.png){width="2.3069444444444445in"
height="5.0in"}

![](vertopal_850ca4026a95469cb4915a42b83d456d/media/image10.png){width="2.3069444444444445in"
height="5.0in"}![](vertopal_850ca4026a95469cb4915a42b83d456d/media/image11.png){width="2.3069444444444445in"
height="5.0in"}
