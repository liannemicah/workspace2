package Projects;

public class Assign4Fundraising {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Bob","Jack","Jill","June","Chris","Joe","Bill","George","Nancy","Hayden"};//String array of participating team members
		double[] raisedMoney = {100,383,293.9,234,383.7,283,29.0,696,9.24,432};//double array of the amount of money each student raised
		boolean[] returnedForm = {true,false,false,true,true,false,false,true,true,false};//boolean array of whether they returned forms or not
		
		//step 1
		//prints all the info of every student
		for(int i = 0; i < names.length; i++) {
			System.out.println("Name: " + names[i] + " \tMoney Raised: $" + raisedMoney[i] + " \tForm returned: " 
					+ returnedForm[i]);
		}
		
		System.out.println();//spacer
	
		//step 2
		double totalAmt = 0;//stores total amount raised
		//adds all the money together to get the total amount of money raised
		for(int i = 0; i < raisedMoney.length; i++) {
			totalAmt += raisedMoney[i];//add each index to totalAmt 
		}
		
		double avgRaised = totalAmt / names.length;//calculates average amount raised		
		int bigMoneyCount = 0;//tracks how many people raised over $200
		
		System.out.println("Students who raise more than $200:");//tells user of the students that raised more than $200

		for(int i = 0; i < raisedMoney.length; i++) {
			//searching for $200
			//counting #of ppl oner $200
			if(raisedMoney[i] > 200) {
				System.out.println(names[i] + " raised $" + raisedMoney[i]);
				bigMoneyCount++;//add one to bigMoneyCount 
			}
		}
		
		System.out.println();//spacer
		System.out.println("Students who has not returned form:");//tells user which student didn't return form
		
		for(int i = 0; i < returnedForm.length; i++) {
			//searching for people who have not returned their form
			if(returnedForm[i] == false) {
				System.out.println(names[i]);//prints name of members that didn't return form
			}
		}
		
		System.out.println();//spacer
		System.out.println("Total amount raised: $" + totalAmt);//prints total amount of money raised
		System.out.println("Average amount raised: $" + avgRaised);//prints average amount of money raised
		
		double lowestAmt;//declare variable for item tracked
		lowestAmt = raisedMoney[0];//assume first index is item searched for
		String person;//String variable called person
		int nameIndex = 0;//tracks index of the person with the lowest amt raised
		
		for(int i = 0; i < raisedMoney.length; i++) {//find lowest amount raised
			if(raisedMoney[i] < lowestAmt) {
				lowestAmt = raisedMoney[i];//set new lowest value
				nameIndex = i;//assigns the nameIndex to the array 
				person = names[i];//assigns person into the names
			}
		}
		//prints the names of who raised the lowest amount with the amount they raised
		System.out.println("Lowest amount raised: $" + lowestAmt + " by " + names[nameIndex]);

	}//end main

}//end class
//105