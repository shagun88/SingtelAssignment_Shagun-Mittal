package assignment1;

public abstract class Bird extends Animal{
	
	public void fly() 
	{
		System.out.println("I am flying");
	}

		public void walk(){
			System.out.println("I am walking");
			}
		
		public void sing()
		{
			System.out.println("I am singing");
		};
		
		public void makeSound(String sound)
		{
			System.out.println(sound);	
		}
}


/*class Rooster extends Chicken
{
	public void sing()
	{
		System.out.println("Cock-a-doodle-doo");	
	}
}*/
