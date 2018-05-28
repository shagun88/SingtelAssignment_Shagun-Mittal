package assignment1;

import java.util.HashMap;

public class TypeOfChicken {
	
	HashMap<String, Object> hm = new HashMap<String, Object>();

	public HashMap<String, Object> getChicken()
	{
	Chicken chicken = new Chicken();
	chicken.makeSound("Cock-a-doodle-doo");
	chicken.fly();
	hm.put("Rooster", chicken);
	return hm;
	}
}
