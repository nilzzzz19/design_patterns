package stratagey;

import stratagey.stratagies.SpecialThingStratagey;

public class Superhero {
	
	SpecialThingStratagey specialThingStratagey; 
	
	//constructor injection
	public Superhero(SpecialThingStratagey specialThingStratagey) {
		super();
		this.specialThingStratagey = specialThingStratagey;
	}

	public void eat() {
		System.out.println("superhero eats...");
	}
	
	/*
	 * public void specialThing() { //this would end up in multiple child classes
	 * writing reusable code as //every superhero has a special ability they can do.
	 * //hence performing a stratagey interface impl to minimize code, maintaINABLE
	 * AND SCALABLE CODE. }
	 */
	public void specialThing() {
		specialThingStratagey.specialThing();
	}

}
 