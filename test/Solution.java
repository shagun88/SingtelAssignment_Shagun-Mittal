package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import assignment1.Animal;
import assignment1.Bird;
import assignment1.Cat;
import assignment1.Chicken;
import assignment1.Dog;
import assignment1.Duck;
import assignment1.Parrot;
import assignment1.TypeOfChicken;

public class Solution {

	public static void main(String[] args) {
		// Printing Duck
		Duck duck = new Duck();
		System.out.println("I am a duck");
		duck.walk();
		duck.sing();
		duck.makeSound();
		
		//Printing varieties of Chicken without inheritance
		System.out.println("I am a Rooster Chicken");
		HashMap<String, Object> hmChicken = new HashMap<String, Object>();
		TypeOfChicken tOchicken = new TypeOfChicken();
		hmChicken = tOchicken.getChicken();
		System.out.println(hmChicken.get("rooster"));

		//Printing Parrot
		System.out.println("Parrot that lives with dog");
		Parrot parrotWithDog = new Parrot();
		Dog dog = new Dog();
		parrotWithDog.makeSound(dog.makeSound());
		
		//Printing cat
		System.out.println("Parrot that lives with cat");
		Parrot parrotWithCat = new Parrot();
		Cat cat = new Cat();
		parrotWithCat.makeSound(cat.makeSound());
		
		
		}
	
	
	}
