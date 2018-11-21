package TutorialPackage;

public class rect {
//instance variables or attributes
	private int length;
	private int width;
	private int x;
	private int y;
	
//constructor
	public rect() {
		x = 10;
		y = 10;
		length = 100;
		width = 50;
	}
	
	public rect(int x, int y, int length, int width) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.width = width;
	}
	
//	public rect(int newX, int y, int length, int width) {
//		x = newX;
//	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void translate(int xMove, int yMove) {
		x += xMove;
		y += yMove;
	}
	
	public String toString() {
		return "x: " + x + "  y: " + y + "  l: " + length + "  w: " + width;
	}

}//end class
