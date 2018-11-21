package Projects;
import java.util.Scanner;

public class NewStore {
	//global variables
	static double price = 0;//total price of sale
	final static double TAX = 0.05;//the amount of tax depends the total amount user spends
	
	static int totalQty = 0;//accumulator = counter 
	static int dogQty = 0;
	static int catQty = 0;
	static int birdQty = 0;

	public static void menu() {
		Scanner scanWords = new Scanner(System.in);//scanner object to take in words
		Scanner scanNums = new Scanner(System.in);//scanner object to take in nums
		//the initial price of each product
		double dogPrice = 966.00;
		double catPrice = 790.30;
		double birdPrice = 63.50;
		
		int itemNum;//creates an int variable, itemNum
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
		
		itemNum = scanNums.nextInt();//scans the input of the items chosen  
		
		if(itemNum != 0) {//prints sentence as long as user choose not to exit
			System.out.println("How many do you want? ");
		}	
		
		if(itemNum <= 0) {//goes to printSummary if user is done shopping
			printSummary();
		}

		int qty = scanNums.nextInt();//scans the amount of items the user bought
			totalQty += qty;
			
		//game takes the amount of items to calculate the total cost as long as user keeps shopping	
			if(itemNum == 1) {
				price = calcCost(dogPrice, qty);
				dogQty += qty;
			}
			else if(itemNum == 2) {
				price += calcCost(catPrice, qty);
				catQty += qty;
			}
			else if(itemNum == 3) {
				price += calcCost(birdPrice, qty);
				birdQty += qty + birdQty;
			}
			else {
				System.out.println("Sorry we don't have that.");
			}
		} while(itemNum != 0); //end of do/while 
		
		printSummary();
		
	}//end menu
	
	public static double calcCost(double itemPrice, int qty) {//creates double & int variable to calculate cost
		return itemPrice * qty;
	}//end calcCost
	public  static double calcTax(double TAX, double price) {//creates double variables to calculate tax
		return TAX * price;
	}//end calcTax
	
	public static void printSummary() {
	//prints the result of how much they spent including their tax	
		System.out.println("Total items sold: " + totalQty);
		System.out.println("Total dogs sold: " + dogQty);
		System.out.println("Total cats sold: " + catQty);
		System.out.println("Total birds sold: " + birdQty);

		System.out.println("Your total price is $" + price);
		System.out.printf("Tax is: %.2f \n", calcTax(TAX,price));
		double totalPrice = calcTax(TAX, price) + price;
		System.out.printf("Your total with tax is %.2f \n" + totalPrice);
		System.out.println("Thanks for shopping.");
	}
	public static void main(String[] args) {
		menu();
	}//end main

}//end class
