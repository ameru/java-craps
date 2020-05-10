# BUS 392: Java Final Project - Build a game!
### Modeled after craps: https://youtu.be/7daSiVupvmY
#### Made by Matias Ilic (@matiilic5), Amy Ru (@ameru), and Alivia Sawyer (@sawyeralivia15)

1. Ask how many players will be playing (max 4)
  * Create array size that is based on number of players
  * Ask for each user user to place bet in order or opt-out (“0”)
  * Store each bet in respective array position
2. “Hit enter to roll the dice”
  * Two random number generators to pick between 1-6 (store 1-6 in list)
  * Print each number individually, and store the added value in a sum variable
3. If 7 or 11, automatic win for everyone at table (for loop that prints each person’s winnings based on the bet stored in their array position)
  * Else if 2 3 or 12, automatic loss for everyone at table (for loop that prints each person’s loss based on the bet stored in their array position)
  * Else store sum in “point” variable
    - Prompt each user for if they will bet again in variable secondBet (store in new array of value double whose size is number of players)
    - Prompt each user if they are betting for or against the point (store in a new array of value char ‘f’ or ‘a’)
      * If user enters not ‘f’ or ‘a’, prompt again for new input until criteria is satisfied (via while loop)
While loop:
  * Continue to roll while the sum is not 7 or the point variable
  * Once it is, store it into a new sum variable 
Create probability array to store multiplier values for each possible number rolled
  * Index according to number being rolled (counting back from 6)
If new sum variable is 7
  * Win for everyone who bet with the point
    - Multiplier * amount of money bet
    - Increment amount of money user has by adding money won
  * Loss for everyone who bet against the point
    - Multiplier * amount of money bet
    - Increment amount of money user has by adding money lost
  * Else
    - Loss for everyone who bet with the point
    - Multiplier * amount of money bet
    - Increment amount of money user has by adding money won
  * Win for everyone who bet against the point
    - Multiplier * amount of money bet
    - Increment amount of money user has by adding money lost
4. (after we have built steps 1-3): Put everything in a giant while loop, update and iterate according to turn
