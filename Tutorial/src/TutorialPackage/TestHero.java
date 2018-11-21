package TutorialPackage;

public class TestHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hero h1 = new Hero();
		Hero h2 = new Hero("idk","telekinesis",500);
		Hero h3 = new Hero("joe","super strength",25);

		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		
		Meteorite m = new Meteorite();
		
		m.mutate(h1);
		m.mutate(h2);



	}

}
