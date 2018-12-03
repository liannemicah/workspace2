package TutorialPackage;
public class tut3 { 
	
	public static boolean doesMatch() {
	
		boolean match;
		boolean d = true;
		boolean f = true;
		
		if(d == f) {
			match = true;
		}
		else {
			match = false;
		}
		
		System.out.println(match);	
		return doesMatch();
		
	}//end doesMatch
	
	public static void main(String[] args) {
		
		doesMatch();

	}//end main
	
}//end class


