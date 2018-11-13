package Projects;

public class Assign4Fundraising {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Bob","Jack","Jill","June","Chris","Joe","Bill","George","Nancy","Hayden"};
		double[] raisedMoney = {100,383,293.9,234,383.7,283,29.0,696,9.24,432};	
		boolean[] returnedForm = {true,false,false,true,true,false,false,true,true,false};
		
		//step 1
		for(int i = 0; i < names.length; i++) {
			System.out.println("Name: " + names[i] + " \t$" + raisedMoney[i] + " \tForm returned: " 
					+ returnedForm[i]);
		}
		
		System.out.println();
	
		//step 2
		double totalAmt = 0;//stores total amount raised
		for(int i = 0; i < raisedMoney.length; i++) {
			totalAmt += raisedMoney[i];//add each index to totalAmt 
		}
		
		double avgRaised = totalAmt / names.length;//calculates average amount raised		
		int bigMoneyCount = 0;//tracks how many people raised over $200
		
		for(int i = 0; i < raisedMoney.length; i++) {
			//searching for $200
			//counting #of ppl oner $200
			if(raisedMoney[i] > 200) {
				System.out.println(names[i] + " raised $" + raisedMoney[i]);
				bigMoneyCount++;//add one to bigMoneyCount 
			}
		}
		
		System.out.println();
				
		for(int i = 0; i < returnedForm.length; i++) {
			//searching for people who have not returned their form
			if(returnedForm[i] == false) {
				System.out.println(names[i] + " has not returned form.");
			}
		}
		
		System.out.println();
		System.out.println("Total amount raised: " + totalAmt);
		System.out.println("Average amount raised: " + avgRaised);
		
		double lowestAmt;//declare var for item tracked
		lowestAmt = raisedMoney[0];//assume first index is item searched for
		String person;
		int nameIndex = 0;//tracks index of the person with the lowest amt raised
		
		for(int i = 0; i < raisedMoney.length; i++) {//find lowest amount raised
			if(raisedMoney[i] < lowestAmt) {
				lowestAmt = raisedMoney[i];//set new lowest value
				nameIndex = i;
				person = names[i];
			}
		}
		
		System.out.println("Lowest amount raised: " + lowestAmt + " by " + names[nameIndex]);

	}//end main

}//end class
