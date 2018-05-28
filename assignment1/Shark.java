package assignment1;

public class Shark extends Fish{

	@Override
	public void size() {
		System.out.println("I am large fish");
		
	}

	@Override
	public void color() {
		System.out.println("I am grey");
		
	}

	@Override
	public void eat() {
		System.out.println("I eat other small fishes");
		
	}
}
