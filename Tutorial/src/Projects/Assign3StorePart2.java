package Projects;
import java.util.Scanner;

public class Assign3StorePart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);//creates a scanner to scan input
		
//a)		
		String[] products = {"banana","yogurt","cheese","lettuce","cucumber","tomato","fish","beef","orange","pineapple"};
		double[] price = {0.80,3.99,4.99,2.35,2.46,4.65,7.54,10.56,4.61,5.49};
		int totalQty = 0;
		
		for(int i = 0; i < products.length; i++) {
			System.out.println((i+1) + products[i]);
		}
 
	}//end main

}//end class
