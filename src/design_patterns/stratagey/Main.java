package design_patterns.stratagey;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Superhero[] listOfHeros = {new Shaktiman(),new Batman(),new Superman(), new Shaktiman()};
		
		Random r = new Random();
		
		int index = r.nextInt(listOfHeros.length);
		
		Superhero s = listOfHeros[index];
		s.eat();
		s.specialThing();
		System.out.println(s.getClass().getName());
	}

}
