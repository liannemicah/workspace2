package TutorialPackage;

public class tut3 { 
	
    private double milesDriven;
    private double gasInTank;
    
    // public void drive(double distance)
    // {
    //     milesDriven = milesDriven + distance;
    // }
    
    // public void addGas(double amount)
    // {
    //     gasInTank = gasInTank + amount;
    // }

   public static void main(String[] args)
   {
       Car mazda = new Car(35);
       mazda.drive(105);
       mazda.addGas(25);

       // TODO: add your code to add 20 gallons to the tank, drive 105 miles, and add 5 gallons
 
       
       //Don't need to modify the line below
       System.out.println(mazda.getGasInTank());
       System.out.println("Expected: 22.0");
   }
		
}//end class


