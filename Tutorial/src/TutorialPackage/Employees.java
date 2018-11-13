package TutorialPackage;

public class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] employeeName = {"Craig","George","Jill","Jones","Basil"};
		int[] wage = {15,16,21,15,22};
		int[] hoursWorked = new int[5];
		
		hoursWorked[0] = 20;
		hoursWorked[0] = 30;
		hoursWorked[0] = 15;
		hoursWorked[0] = 60;
		hoursWorked[0] = 38;
		
		for(int i = 0; i < wage.length; i++) {
			System.out.println("i: " + i + " Name: " + employeeName[i] + " \tWage: " + wage[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < wage.length; i++) {//linear search for wage over 20
			System.out.println("Name: " + employeeName[i] + " \tPay: " + wage[i] + hoursWorked[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < wage.length; i++) {
			if(wage[i] > 20) {
				System.out.println("FIRED: " + employeeName[i]);
				employeeName[i] = "";
				wage[i] = 0;
			}//end if
		}//end for
		
		System.out.println();

		for(int i = 0; i < wage.length; i++) {
			System.out.println("i: " + i + " Name: " + employeeName[i] + " \tWage: " + wage[i]);
		}//end for
		
	}//end static void

}//end class
