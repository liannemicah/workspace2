package Hero;

public class Hero {
	private String name;
	private String power;
	private int age;
	private int health;
	private int dmg;
	
	public Hero() {
		name = "Jane doe";
		power = "super speed";
		age = 20;
		health = 100;
		dmg = 10;
	}
	
	public Hero(String name, String power, int age, int health, int dmg) {
		this.name = name;
		this.power = power;
		this.age = age;
		this.health = health;
		this.dmg = dmg;
	}
	
	public void setPower(String power) {
		this.power = power;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getDmg() {
		return dmg;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void attack(Hero h) {
		h.setHealth(h.getHealth() - dmg);
		//health = 
	}
	
	public String toString() {
		return "Name: " + name + "Power: " + power;
	}

}//end class
