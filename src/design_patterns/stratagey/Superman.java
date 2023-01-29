package design_patterns.stratagey;

import design_patterns.stratagey.stratagies.Fly;


public class Superman extends Superhero {

	public Superman() {
		super(new Fly());
		
	}

}
