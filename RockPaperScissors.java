package loopsPrograms;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
	public static void main(String[] args){
		//Hamshika Rajkumar
		// rock paper scissors game
		
		//declare variables and set up Scanner
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		int yourGuess, computersGuess, tieCount = 0, lossCount=0, winCount = 0;
		String another; 
		Scanner scn = new Scanner(System.in);
		Scanner kbd = new Scanner(System.in);
		Random rand = new Random(); 
		
		//ask user
		System.out.print("Start Game ('y' to play, 'q' to quit.)");
		another = scn.nextLine();
		
		while(another.equalsIgnoreCase("y"))
		{
			System.out.println("----------------------------------");
			System.out.println("Computers Turn: ");
			computersGuess = rand.nextInt(2);
			System.out.println("----------------------------------");
			System.out.println("Your Turn (0 for scissors, 1 for rock and 2 for paper): ");
			yourGuess = kbd.nextInt();

			if(yourGuess == computersGuess) 
			{
				System.out.println("It's a TIE!");
				if (computersGuess == ROCK )
					System.out.println("Computer's choice: rock\nYour choice: rock");
				else if (computersGuess == PAPER)
					System.out.println("Computer's choice: paper\nYour choice: paper");
				else 
					System.out.println("Computer's choice: scissors\nYour choice: scissors");
				
				tieCount++;
			}
			else if((yourGuess == ROCK && computersGuess == SCISSORS) || (yourGuess == SCISSORS && computersGuess == PAPER)
					|| (yourGuess == PAPER && computersGuess == ROCK))
			{
				System.out.println("You WON :)");
				if (computersGuess == ROCK )
					System.out.println("Computer's choice: rock");
				else if (computersGuess == PAPER)
					System.out.println("Computer's choice: paper");
				else 
					System.out.println("Computer's choice: scissors");
				
				if (yourGuess == ROCK )
					System.out.println("Your choice: rock");
				else if (yourGuess == PAPER)
					System.out.println("Your choice: paper");
				else 
					System.out.println("Your choice: scissors");
				
				winCount++;
			}
			else
			{
				System.out.println("You LOST :(");
				
				if (computersGuess == ROCK )
					System.out.println("Computer's choice: rock");
				else if (computersGuess == PAPER)
					System.out.println("Computer's choice: paper");
				else 
					System.out.println("Computer's choice: scissors");
				
				if (yourGuess == ROCK )
					System.out.println("Your choice: rock");
				else if (yourGuess == PAPER)
					System.out.println("Your choice: paper");
				else 
					System.out.println("Your choice: scissors");
				
				lossCount++;
			}

			System.out.println("----------------------------------");
			System.out.print("Play Again ('y' to play, 'q' to quit.)");
			another = scn.nextLine();
			System.out.println("----------------------------------");
		}

	  System.out.println("Results:");
	  System.out.println("Wins: \t\t" + winCount);
	  System.out.println("Losses: \t" + lossCount);
	  System.out.println("Ties: \t\t" + tieCount);
	  kbd.close();
	  scn.close();
	 }
}
