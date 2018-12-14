package Projects;
import java.util.Scanner;

public class Assign3StorePart2 {
	
	//creates initial static variables to determine price and the amount of items chosen by user 
	static double itemPrice = 0;
	static double totalPrice = 0;
	static int totalQty = 0;
	//an array to determine the amount of items user picks
	static int[] itemQty = new int [10];//this array can store up to 10 elements

	static String[] products = {"banana","yogurt","cheese","lettuce","cucumber","tomato","salmon","chicken","orange","pineapple"};//static String array lists of what products are in stock
	static double[] price = {0.89,3.99,4.99,2.35,2.46,4.65,12.54,9.56,4.61,5.49};//static double array of how much the products each cost
		
	public static void shopping() {//where the user shops for food
		Scanner input = new Scanner(System.in);//creates a scanner to scan input

		int itemNum;//creates int variable to scan input
		System.out.println("Hi, welcome to the grocery store.");//welcomes user to what store they're in
		System.out.println();//spacer
		
		do {//do statement
			
			System.out.println();//spacer
			//prints lists for the products and their prices
			for(int i = 0; i < products.length; i++) {
				System.out.println((i+1)+ ". " + products[i] + "\t $" + price[i]);
			}
			
			System.out.println();//spacer
			//tells user to print the item number of what they want or print 0 when their done
			System.out.println("Print the number of the product you'd like to purchase, or print 0 when you're done: ");
			itemNum = input.nextInt();//scans the item number the user prints
			//prints how much they'd like of what # they chose as long as it is not 0
			if(itemNum != 0) {
				System.out.println("how much would you like?");
			}
			//leads user directly to the cashier void if they're done (choose 0)
			if(itemNum <= 0) {
				cashier();
			}
			int qty = input.nextInt();//scans the amount of items the user bought
			totalQty += qty;//adds the amount of items altogether
			//game takes the amount of items to calculate the total cost as long as user keeps shopping	
				if(itemNum == 1) {
					System.out.println(qty + " " + products[0] + " comes to $" + qty*price[0]);
					itemPrice = calcCost(price, qty);
					itemQty[0] += qty;
				}
				else if(itemNum == 2) {
					System.out.println(qty + " " + products[1] + " comes to $" + qty*price[1]);
					itemPrice = calcCost(price, qty);
					itemQty[1] += qty;
				}
				else if(itemNum == 3) {
					System.out.println(qty + " " + products[2] + " comes to $" + qty*price[2]);
					itemPrice = calcCost(price, qty);
					itemQty[2] += qty;
				}
				else if(itemNum == 4) {
					System.out.println(qty + " " + products[3] + " comes to $" + qty*price[3]);
					itemPrice = calcCost(price, qty);
					itemQty[3] += qty;
				}
				else if(itemNum == 5) {
					System.out.println(qty + " " + products[4] + " comes to $" + qty*price[4]);
					itemPrice = calcCost(price, qty);
					itemQty[4] += qty;
				}
				else if(itemNum == 6) {
					System.out.println(qty + " " + products[5] + " comes to $" + qty*price[5]);
					itemPrice = calcCost(price, qty);
					itemQty[5] += qty;
				}
				else if(itemNum == 7) {
					System.out.println(qty + " " + products[6] + " comes to $" + qty*price[6]);
					itemPrice = calcCost(price, qty);
					itemQty[6] += qty;
				}
				else if(itemNum == 8) {
					System.out.println(qty + " " + products[7] + " comes to $" + qty*price[7]);
					itemPrice = calcCost(price, qty);
					itemQty[7] += qty;
				}
				else if(itemNum == 9) {
					System.out.println(qty + " " + products[8] + " comes to $" + qty*price[8]);
					itemPrice = calcCost(price, qty);
					itemQty[8] += qty;
				}
				else if(itemNum == 10) {
					System.out.println(qty + " " + products[9] + " comes to $" + qty*price[9]);
					itemPrice = calcCost(price, qty);
					itemQty[9] += qty;
				}
				else {
					System.out.println("Invalid number, try agian.");
					shopping();
				}
		
		} while(itemNum != 0);//every function within the do statement will keep occurring as long as user doesn't print 0
		
		cashier();//takes user to cashier
		
	}//end shopping()
	
	private static double calcCost(double[] price2, int itemQty2) {
		return 0;
	}

	public static double calcCost(double price, int itemQty) {//creates double & int variable to calculate cost
		return price * itemQty;
	}//end calcCost
	
	public static void cashier() {	//where user pays their stuff
		//prints only products the user picks along with the total of price and the amount they bought
		System.out.println("Product: " + "\tPrice: " + "\tNum Bought: " + "\tTotal: ");
		for(int i = 0; i < products.length; i++) {
			if(itemQty[i] > 0) {
				System.out.println(products[i] + "\t\t$" + price[i] + "\t" + itemQty[i] + "\t\t"  + "$" + (itemQty[i]*price[i]));
			}
			totalPrice += (itemQty[i]*price[i]);//total price sums up all the amount the user buys
		}
		System.out.println();//spacer
		System.out.println("Total: $" + totalPrice);//informs the total to the user
		System.out.println();//spacer
		System.out.println("Thank you for shopping, have a nice day!");//thanks the user to tell that their done
	}

	public static void main(String[] args) {//program begins with grocery shopping 
		// TODO Auto-generated method stub
		shopping();
	}//end main

}//end class
