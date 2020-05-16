import java.util.Random;
import java.util.Scanner;

public class BeginningOfGame {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		
		System.out.print("This is the game Craps, please enter how many" +
				"\nplayers there are- maximum of 4: ");
		int players = keyboard.nextInt();
		
		int [] amountOfPlayers = new int [players];		//array for storing # of players
		
			for(int i = 1; i <= players; i++)
			{
				System.out.print("\nEnter an amount you'd like to bet," + 
				"\n or press \"0\" to opt out: ");
				double placeBet = keyboard.nextDouble();
				double [] betAmount = new double[(int) placeBet]; //array for storing bets
			}
		for(int a = 1; a <= players; a++)
		{
			int roll1 = rand.nextInt(6) + 1;
			int roll2 = rand.nextInt(6) + 1;
			int dice = roll1 + roll2;
			System.out.println("You rolled a " + roll1 + " and a " +  roll2 + ", so a " + dice + ".");
		}														
			
		
		
	}

}
