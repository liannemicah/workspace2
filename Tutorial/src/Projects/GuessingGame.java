package Projects;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {

		Random randNums= new Random();//randomizes initial number
		
		// create scanner objects for l8tr
		Scanner scanWords = new Scanner(System.in);//scanner object to take in words
		Scanner scanNums = new Scanner(System.in);//scanner object to take in numbers
				
		// prompt user for name
		System.out.println("Enter your name: ");
		String name = scanWords.nextLine();
		
		// write a stalker message to the user
		System.out.println("Greetings " + name + ". I am your stalker, wanna play a little game ಠ⌣ಠ \r\n" + 
				"?");
		
		// prompt for decision
		System.out.println("Type 1 for yes or 2 for no.");
		int option = scanNums.nextInt();
		if (option == 1) {//executes the message if user types 1
			System.out.println("Great. let's go.");
		}
		else if (option == 2) {//executes the message if user types 2
			System.out.println("Welp, that's too bad, you're playing anyways. >:3");
		}
		else {//executes the message if user types different number
			System.out.println("That's not part of the options but you're playing anyways. >:)");
		}
		// actually start the game 
		int random_number_that_the_player_has_to_guess = randNums.nextInt(100) +1;//number would be randomized 
		int guesses_left = 3;//user has three guesses 
		int guess = 0;
		
		System.out.println("(ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ In this game I will select a number between 0 and 100 you guess the number\n "
						+ "sleect the number correctly and you win. You get 3 chances if you can't guess it\n "
						+ "in time ya die ✧ﾟ･:*ヽ(◕ヮ◕ヽ)\n");
		
		while(guesses_left != 0 && guess != random_number_that_the_player_has_to_guess)//game continues as long as user still has more guesses or if user guesses the wrong number
		{
	
			//prompt user for guess
			System.out.print("what is your guess");
			guess = scanNums.nextInt();
			
			if(guess == random_number_that_the_player_has_to_guess) {//executes message if user guesses right number
				System.out.print("okay you win, but just so you know... You'll always be m i n e! (• ε •)");
				break ; // break out of while loop
			}
			else if (guess < random_number_that_the_player_has_to_guess){//executes message if user's guess is low
				System.out.println("you're guess is too low. Try again.");
			}
			else {//executes message if user's guess is high
				System.out.println("You're guess is too high. Try again.");
			}
			
			guesses_left -= 1;//chances of guesses deduct whenever user makes a guess
	
		} // end of while loop
		
		if(guesses_left == 0) {//executes message if user runs out of guesses	
			System.out.println("You suck and ran out of guesses you d i e ☜(ﾟヮﾟ☜)\r\n");
			// end game
		}
		
	}//end main

}//end class
