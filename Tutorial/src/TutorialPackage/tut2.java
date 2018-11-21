package TutorialPackage;
import java.util.Random;

public class tut2 {
	
	public static boolean isPrime() {
		
		int primeNum = 0,n = 0;//creates int value starting to 0
		Random r = new Random();//creates random to randomize r
		boolean prime;//creates boolean value called prime
		primeNum = r.nextInt(101);//randomizes 

		if(primeNum == 0 || primeNum == 1) {
			prime = false;
		}
		
		else {
			for(int i = 2; i <= primeNum; i++) {
				if(primeNum % i == 0) {
					prime = false;
					n = 1;
					break;
				}
			}//end for
			
			if(n == 0) {
				prime = true;
			}
		}//end else		
		
		return isPrime();

	}//end isPrime
		
	public static void main(String[] args) {
		isPrime();
	}
	
}//end class
