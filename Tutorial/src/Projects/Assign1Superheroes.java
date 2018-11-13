package Projects;
import java.util.Scanner;
public class Assign1Superheroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);//creates a scanner to scan input
		String[] heroes = {"Spiderman","Ironman","Doctor Strange","Hulk","Thor"};//a string array of heroes
		
		String[] powers = new String[heroes.length];//creates string array 'powers' to store within the heroes
		
		//includes a string for each powers variable
		powers[0] = "spider-senses";
		powers[1] = "durability";
		powers[2] = "spells";
		powers[3] = "strength";
		powers[4] = "lightning"; 
		
		boolean[] isHuman = new boolean[heroes.length];//creates boolean array 'isHuman' to store within 'heroes'
		
		//initial boolean to determine if the hero is human
		isHuman[0] = true;
		isHuman[1] = true;
		isHuman[2] = true;
		isHuman[3] = false;
		isHuman[4] = false;
		
		//prints the array list of heroes and their status
		for(int i = 0; i < heroes.length; i++) {
			System.out.println("i: " + i + " Name: " + heroes[i] + " \t\tPowers: " + powers[i] + " \tAre they human?: " + isHuman[i]);
		}
		
		//checks if the heroes are human
		//if not human, their powers changes to 'NONE'
		for(int i = 0; i < heroes.length; i++) {
			if(isHuman[i] == false) {
				powers[i] = "NONE";
			}
		}
		
		System.out.println();//spacer
		System.out.println("A disease known as the Couprinite has been exposed to the Avengers. Everyone survived its effect, however, " + heroes[4] + " and the " + heroes[3] + " loose all their "
				+ "\npowers...");//a brief story as to how they lost their powers
		System.out.println();//spacer
		System.out.println("...status updated.");//informs user the status has updated
		System.out.println();//spacer
		
		//prints the array list of heroes and their current status
		for(int i = 0; i < powers.length; i++) {
			System.out.println("i: " + i + " Name: " + heroes[i] + " \t\tPowers: " + powers[i] + " \t\tAre they human?: " + isHuman[i]);
		}

	}//end main

}//end class
