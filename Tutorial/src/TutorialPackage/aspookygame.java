package TutorialPackage;
import java.util.Scanner;
public class aspookygame {
	
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] monster = {"vampire","mummy","werewolf","witch","zombie","skeleton","player"};
		
		System.out.println("Enter player name: ");
		monster[monster.length - 1] = "Player " + input.nextLine();
		
		int[] coins = new int[monster.length];
		
		//add random # of coins
		for(int i = 0; i < monster.length; i++) {
			coins[i] = (int)(Math.random() * 8) + 2;
			System.out.println(monster[i] + " has " + coins[i] + " gold coins.");
		}//end for loop
		
		String[] abilities = new String[monster.length];
		
		abilities[0] = "fangs";
		abilities[1] = "fear";
		abilities[2] = "claws and biting";
		abilities[3] = "evil witch powers";
		abilities[4] = "brain eating teeth";
		abilities[5] = "bones";
		abilities[6] = "the power of god and anime";
		
		System.out.println();
		
		for(int i = 0; i < monster.length; i++) {
			System.out.println(monster[i] + " will attack with " + abilities[i]);
		}
		
		System.out.println();
		//prints their abilities
		int[] hp = new int[monster.length];
		//assign random hp
		for(int i = 0; i < monster.length; i++) {
			hp[i] = (int)(Math.random() * 15 + 2);
		}
		//prints out hp
		for(int i = 0; i < monster.length; i++) {
			System.out.println(monster[i] + " has " + hp[i] + " health points. ");
		}
		
		System.out.println();
		
		System.out.println("The " + monster[2] + " ate a teenager, how many coins did it get?");//prompt to enter #
		//taking in a # from user input
		coins[2] += input.nextInt();//adding coins to coins[2]
		input.nextLine();
		
		//taking in a string from user input
		System.out.println(monster[2] + " morps into what? ");
		monster[2] = input.nextLine();
			
		System.out.println("The monster is now a " + monster[2]);
		
		System.out.println();
		
		//todo list:
		int totalCoins = coins[monster.length - 1];
		int turns = 0; 
		//fight while player hp > 0
		while(hp[hp.length-1] > 0) {
			int randomMonster = (int)(Math.random() * monster.length);//pick random monster
			if(randomMonster != monster.length-1) {
				//decide hit or be hit
				int hitChance = (int)(Math.random() * 2);
				
				if(hitChance % 2 == 0) {
				    //subtract hp if player is hit
					int randomDmg = (int)(Math.random() * 2 + 1);
					hp[monster.length - 1] -= randomDmg;
					System.out.println(monster[randomMonster] + " hit you for " + randomDmg + " hp! " + hp[monster.length-1] + " hp left: ");
				}
			
				else {
					System.out.println("Player hits with" + abilities[monster.length] + " " + monster[randomMonster] + " runs away. It left" + coins[randomMonster] + " coins.");
					//collect coins
					totalCoins += coins[randomMonster];
				}
				//track numbers of turns	
				turns++;
			}//end if
			System.out.println();
		}//end while
		
		System.out.println("You run away with " + totalCoins + " coins and lasted " + turns + " turns.");
		
	}//end main

}//end class
