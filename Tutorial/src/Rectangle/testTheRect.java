package Rectangle;

public class testTheRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rect r1 = new rect();
		rect r2 = new rect(5,20,200,5);

		r2.translate(25,-25);
		System.out.println(r1.toString());
		System.out.println(r2.toString());


	}//end main

}//end class
