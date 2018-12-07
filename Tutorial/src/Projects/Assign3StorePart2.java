package Projects;
import java.util.Scanner;

public class Assign3StorePart2 {
	
	static double itemPrice = 0;
	static int[] itemQty = new int [10];

	static int totalQty = 0;
	static double totalPrice = 0;
//	static int qty1 = 0;
//	static int qty2 = 0;
//	static int qty3 = 0;
//	static int qty4 = 0;
//	static int qty5 = 0;
//	static int qty6 = 0;
//	static int qty7 = 0;
//	static int qty8 = 0;
//	static int qty9 = 0;
//	static int qty10 = 0;
		static String[] products = {"banana","yogurt","cheese","lettuce","cucumber","tomato","salmon","chicken","orange","pineapple"};
		static double[] price = {0.89,3.99,4.99,2.35,2.46,4.65,12.54,9.56,4.61,5.49};
		
	public static void shopping() {
		
		Scanner input = new Scanner(System.in);//creates a scanner to scan input

		int itemNum;
		System.out.println("Hi, welcome to the grocery store.");
		System.out.println();
		
		do {
			
			System.out.println();
	
			for(int i = 0; i < products.length; i++) {
				System.out.println((i+1)+ ". " + products[i] + "\t $" + price[i]);
			}
			
			System.out.println();
			System.out.println("Print the number of the product you'd like to purchase, or print 0 when you're done: ");
			itemNum = input.nextInt();
			if(itemNum != 0) {
				System.out.println("how much would you like?");
				//System.out.println(itemQty + products[i] + " comes to $" + itemQty*price[i]);
			}
			if(itemNum <= 0) {
				cashier();
			}
			int qty = input.nextInt();//scans the amount of items the user bought
			totalQty += qty;
			
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
		
		} while(itemNum != 0);
		
		cashier();
		
	}//end shopping()
	
	private static double calcCost(double[] price2, int itemQty2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static double calcCost(double price, int itemQty) {//creates double & int variable to calculate cost
		return price * itemQty;
	}//end calcCost
	
	public static void cashier() {
		System.out.println("Product: " + "\tPrice: " + "\tNum Bought: " + "\tTotal: ");
		for(int i = 0; i < products.length; i++) {
			if(itemQty[i] > 0) {
				System.out.println(products[i] + "\t\t" + price[i] + "\t" + itemQty[i] + "\t\t"	+ " " + (itemQty[i]*price[i]));
			}
			totalPrice += (itemQty[i]*price[i]);

		}
		System.out.println("total: " + totalPrice);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shopping();
	}//end main

}//end class
