/*
* All Cows are Animals but all Animals are not Cows
*/
public class Cow extends Animal {

	public Cow() {
		super();
		System.out.println("Now I am a Cow!");
	}

	@Override
	public String sleep() {
		return "A cow sleeps...";
	}

	@Override
	public String eat() {
		return "A cow eats...";
	}

	public String moo() {
		return "A cow moos..";
	}

	public String rest() {
		return "A cow rests..";
	}
}
