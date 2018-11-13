package Projects;

import java.util.Scanner;

public class nameReversal {

	public static void main(String[] args) {
		
		Scanner scanWords = new Scanner(System.in);//scanner object to take in words
		
		System.out.println("Please enter your name: ");//tells user to enter their name
		String subString = scanWords.nextLine();//scans user's name to the next line
		
		scanWords.close();
		
		for (int i = subString.length()-1; i >= 0; i--) {//takes the length of the user's name starting from the end of the word. Loop continues until it reaches the first character
			System.out.print(subString.charAt(i));//prints their name backwards
		}//end for loop
	}//end static void
}//end class
