# Java_Craps

### Description:
Craps is a gambling game that is played on a purpose-built table using two dice. The game consists of players placing bets on the outcome of the dice roll. The main goal of the game is to bet on a number which will be the come out or won't be the come out on the next roll of the dice.
 
### Requirements:
The current player must handle the dice with one hand only while throwing, and the dice must hit the walls on the opposite end of the table. In a casino atmosphere, a craps table can accommodate up to 20 players, who each get a round of rolling or 'shooting' the dice. If they don't want to throw the dice, they can bet on the thrower. Every player at the table gets a turn to roll the dice, but players are not required to roll the dice if they don’t want to. Turns to roll follow in a clockwise fashion. When the game begins, the first roll is called the “come out” roll. 
If a 7 or an 11 are rolled on the come out roll, that player wins and gets to roll again 
If a 2, 3, or 12 are rolled, the player loses, but still gets to roll again
If a 4, 5, 6, 8, 9, or 10 are rolled, that becomes the player’s Point, and the player continues to roll until the Point number is rolled again, or a 7 is rolled.
If the current player rolls the Point number, the result is a win for the bets, if they roll a 7, they lose and the round ends. 
For placing bets, players can either bet for or against the current player rolling the dice. 
A Pass Line bet bets for the current player to win
A Don’t Pass Line bet  bets that the current player will lose
There are always 1.40% odds against the current player rolling, making the Don’t Pass Line favorable by that same 1.40%. 

### User interface mock-up:
1. The printing of the game board.
<img src = https://github.com/ameru/java_craps/blob/master/readme_images/1.png>

2. The console displays a welcome message asking the user if they would like to play the game Craps.
<img src = https://github.com/ameru/java_craps/blob/master/readme_images/2.png>

3. The console asks the user how many players will be playing in the current game of Craps, there is a maximum of 6 players. Each player has a wallet that begins with $100.
<img src = https://github.com/ameru/java_craps/blob/master/readme_images/3.png>

4. Regardless of the amount of players, each  player is asked how much money they would like to bet.
<img src = https://github.com/ameru/java_craps/blob/master/readme_images/4.png>

5. Depending on the amount of players, the current player will be asked which player is rolling the dice.
<img src = https://github.com/ameru/java_craps/blob/master/readme_images/5.png>

6. After the console asks which user is rolling the dice, they will be prompted to enter “enter” into the console for the dice to be rolled.
<img src = https://github.com/ameru/java_craps/blob/master/readme_images/6.png>

7. There are 3 possible outcomes that can happen when the dice are rolled:
  * The current player rolls a 4, 5, 6, 8, 9, or a 10, and that number becomes their point value.
<img src = https://github.com/ameru/java_craps/blob/master/readme_images/7.png>

   * They will then be prompted if they would like to place another bet for the next round, then they can choose if they would like to bet for or against the point value.
    <img src = https://github.com/ameru/java_craps/blob/master/readme_images/7i.png>
  
   * This shows if they won or lost depending on if they were for or against the point value.
    <img src = https://github.com/ameru/java_craps/blob/master/readme_images/7ii.png>

  * The current player rolls a 2, 3, or 12, causing them to automatically lose.
   <img src = https://github.com/ameru/java_craps/blob/master/readme_images/7b.png>
  
  * The current player rolls a 7 or 11, meaning an instant win. After the b. and c. scenarios, the user’s running total of winnings is presented.
   <img src = https://github.com/ameru/java_craps/blob/master/readme_images/7c.png>

8. After any of these 3 scenarios, the user is asked if they would like to play again, by responding with “yes” or “no” in the console.
 <img src = https://github.com/ameru/java_craps/blob/master/readme_images/8.png>
