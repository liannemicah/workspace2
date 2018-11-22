package Hero;

public class TestHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hero h1 = new Hero();
		Hero h2 = new Hero("idk","telekinesis",500,180,20);
		Hero h3 = new Hero("joe","super strength",25,90,15);

		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		
		Meteorite m = new Meteorite();
		
		m.mutate(h1);
		m.mutate(h2);
		m.mutate(h3);
		
		while(h1.getHealth() > 0) {
			h2.attack(h1);
			System.out.println("hero 1 health: " + h1.getHealth());
		}//end while




	}

}
