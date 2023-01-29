package design_patterns.stratagey;

import design_patterns.stratagey.stratagies.Fly;


public class Shaktiman extends Superhero {

	public Shaktiman() {
		super(new Fly());
	}

}
