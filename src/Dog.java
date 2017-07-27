/*
* All Dogs are Animals but all Animals are not Dogs
*/
public class Dog extends Animal {

	public Dog() {
		super();
		System.out.println("Now I am a Dog!");
	}

	@Override
	public String sleep() {
		return "A dog sleeps...";
	}

	@Override
	public String eat() {
		return "A dog eats...";
	}

	public String bark() {
		return "A dog barks!";
	}

	public String wagTheTail() {
		return "A dog wags the tail...";
	}
}
