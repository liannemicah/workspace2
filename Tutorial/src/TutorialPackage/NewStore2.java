package TutorialPackage;
import java.util.Scanner;

public class NewStore2 {

	public static void main(String[] args) {
		Scanner scanWords = new Scanner(System.in);//scanner object to take in words
		Scanner scanNums = new Scanner(System.in);//scanner object to take in nums
		double dogPrice = 966.00;//
		double catPrice = 790.30;
		double birdPrice = 63.50;
		double price = 0;//total price of sale
		final double TAX = 0.05;
		int itemNum;
		System.out.print("What's your name?: ");
		String name = scanWords.nextLine();//declare name variable and store input
		
		System.out.println("\nHello " + name + ". Welcome to the pet store.");
		//menu items
		do {
		System.out.println("\nWhat would you like to buy?\n"
				        + "0. Exit\n"
						+ "1. dog\n" 
						+ "2. cat\n" 
						+ "3. bird");
		
		itemNum = scanNums.nextInt();
			
			System.out.println("How many do you want? ");
			
			int qty = scanNums.nextInt();
			
			if(itemNum == 1) {
				price = dogPrice * qty + price;
			}
			else if(itemNum == 2) {
				price += catPrice * qty;
			}
			else if(itemNum == 3) {
				price += birdPrice * qty;
			}
			else {
				System.out.println("Sorry we don't have that.");
			}
		} while(itemNum != 0); //end of do/while 
		
		System.out.println("Your total price is $" + price);
		System.out.println("Tax is: " + price * TAX);
		double totalPrice = price * TAX + price;
		System.out.println("Your total with tax is " + totalPrice);
		System.out.println("Thanks for shopping.");

	}

}
