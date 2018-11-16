package TutorialPackage;
import java.util.ArrayList;
public class tut3 { //ArrayListTest
	
	public static void main(String[] args) {
		
		ArrayList<Integer> listOfInts = new ArrayList<>();
		//methods of ArrayLists
		
		listOfInts.add(98);//adding to ArrayList
		listOfInts.add(55);
		listOfInts.add(1,80);//inserts to index 1 in this case
		listOfInts.remove(0);//remove item at first index
		listOfInts.get(0);//returns item at index 0
		listOfInts.size();//returns size of ArrayList
		
		//print ArrayList
		listOfInts.add(98);
		listOfInts.add(24);

		for(int i = 0; i < listOfInts.size(); i++) {
			System.out.println(listOfInts.get(i));
		}
		
		listOfInts.remove(listOfInts.size()-1);//remove last element
		//print new ArrayList
		for(int i = 0; i < listOfInts.size(); i++) {
			System.out.println(listOfInts.get(i));

		}
		
		System.out.println(listOfInts.indexOf(98));
		System.out.println(listOfInts.indexOf(99));

	}//end main
	
}//end class