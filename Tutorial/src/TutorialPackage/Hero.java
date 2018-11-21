package TutorialPackage;

public class Hero {
	private String name;
	private String power;
	private int age;
	
	public Hero() {
		name = "Jane doe";
		power = "super speed";
		age = 20;
	}
	
	public Hero(String name, String power, int age) {
		this.name = name;
		this.power = power;
		this.age = age;
	}
	
	public void setPower(String power) {
		this.power = power;
	}
	
	public String toString() {
		return "Name: " + name + "Power: " + power;
	}

}//end class
