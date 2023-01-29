package design_patterns.stratagey;

import design_patterns.stratagey.stratagies.FastRunner;


public class Flash extends Superhero {

	public Flash() {
		super(new FastRunner());
		
	}

}
