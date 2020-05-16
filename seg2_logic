package java_craps;

import java.util.Random;
import java.util.Scanner;
public class Craps_logic {

	public static void main(String[] args) {
		Random rand = new Random(); // instance of random class
		int upperbound = 7; // generate random values from 0-6
		int diceRoll = rand.nextInt(upperbound); // rolls dice output of integer value
		int wallet;
		int moneyBet;

		// first roll
		for(int i = 0; i < numberOfPlayers.length; i++)
		{
		if ((diceRoll == 7) || (diceRoll == 11)) {
			System.out.print("You won " + moneyBet + "! " + "Good roll.");
			wallet += moneyBet;
		}
		else if ((diceRoll == 2) || (diceRoll == 3) || (diceRoll == 12)) {
				System.out.println("Bad luck. You lose " + moneyBet + "this round.");
				 wallet -= moneyBet;
		}
		else {
				int pointVariable = diceRoll;
		}	
	}
		// Placing a bet
		Scanner keyboard = new Scanner(System.in);
		System.out.print("If you'd like to double your bet, enter \"y\". If not, enter \"n\".: ");
		String secondBet = keyboard.nextLine();
			if (secondBet == "y") {
				wallet *= 2;
			}
			else {
			}
		
		System.out.print("If you are betting for the point, enter \"f\". "
				+ "If you are betting against the point, enter \"a\".");
		Scanner userInput;
		String betPosition = userInput.nextLine();
		// if input is invalid condition
			System.out.print("Invalid input. Please enter \"f\" or \"a\".");
		}
		
		// While loop
		Random rand2 = new Random(); 
		int upperbound2 = 7;
		int diceRoll2 = rand.nextInt(upperbound);
		int pointVariable = diceRoll;
		int wallet;
		int moneyBet;
		// initialize locally or subbranch?
		
			while ((diceRoll2 != 7) || (diceRoll2 != pointVariable)) {
				System.out.println(rand2.nextInt(6));
				diceRoll2++;
			}
			
		if (diceRoll2 == 7) {
			if (betPosition == "f") {
				wallet -= moneyBet;
				System.out.print("Tough luck. You lost " + moneyBet);
			}
			else {
				wallet += moneyBet;
				System.out.print("Nice call! You won " + moneyBet);
			}
				
		if (betPosition == "a") {
				wallet += moneyBet;
			}
			else {
				wallet -= moneyBet;
				System.out.print("Tough luck. You lost " + moneyBet);
			}
		}
		else {
			wallet += moneyBet;
			System.out.print("Nice call! You won " + moneyBet);
		}	
		
	}
}	

