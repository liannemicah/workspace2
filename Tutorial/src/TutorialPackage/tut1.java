package TutorialPackage;

import java.util.Scanner;

public class tut1 {
	//bulbfuturistic
	
	/**
	 * it calculates circumference given a radius 
	 * @param radius - a double that represents the radius 
	 * @return - the circumference of the circle
	 */
	public static double circumference(double radius) {//header or signature
		double circumference = 2 * Math.PI * radius; 
		return circumference; 
	}
	
	public static void areaOfRectangle(int l, int w) {
		double r = 4.6;
		double c = circumference(r);
		
		System.out.println("circumference is: " + c);
		
		int l = 4;
		int w =10;
		
		System.out.println("area is: " + areaOfRectangle(l,w));
	}

	
	public static void printName() {
		for(int i = 0; i < 5; i++) {
			System.out.println("HI\n");
		} //end for
		
		int num = 0;
		while(num < 5) {
			System.out.println("BYE");
			num++;
		} //end while
	} //end printName()
	
	public static void main(String[] args) {
//		int varNum1;
//		varNum1 = 10;
	
//		int varNum2 = 25;
				
//		int varNum3;
//		varNum3 = varNum1 + varNum2;
		
//		System.out.print(varNum3);
//		System.out.println(varNum2);
//		System.out.println(varNum1);
		
//		printName();
//if(varNum3 > 5) {
//	System.out.println("greater");
//		}
//else
//	System.out.println("less");

//	    String inData;
//		Scanner scan = new Scanner(System.in);

//		System.out.println("Enter the data:");
//		inData = scan.nextLine();

//		System.out.println("You entered: " + inData );

//		int num;
//		int square;
//		System.out.println("Enter an integer:");
//		num = scan.nextInt();
//		square = num + num ; // compute the square
		
//		System.out.println("The square of " + num + " is " + square);
		
		
//		Random rand = new Random();
		
//		int randomNum = rand.nextln(11) + 5;
		
//		System.out.println(randomNum);

	}//end main

}//end class
