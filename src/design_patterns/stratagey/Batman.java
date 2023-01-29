package design_patterns.stratagey;

import design_patterns.stratagey.stratagies.Jump;


public class Batman extends Superhero{

	public Batman() {
		super(new Jump());
		
	}

}
