package Unit2.ComparableAssignment;

import java.util.Arrays;

public class PetTest
{
	public static void main(String[] args)
	{
		/* Pet p1 = new Pet("Steve"); */
		
		Dog d1 = new Dog("Louie",1);
		Dog d2 = new Dog("Benny",24);
		Dog d3 = new Dog("Bouie",2324);
		Dog d4 = new Dog("Lenny",245);
		Dog d5 = new Dog("Blouie",83);
		
		Snake s1 = new Snake("Gilbert",2234);
		Snake s2 = new Snake("Sasha", 209);
		Snake s3 = new Snake("Gilbert",200);
		Snake s4 = new Snake("Gasha", 17);
		Snake s5 = new Snake("Sgilbert",19832);

		int[][] a;

		
		Pet[] pets = {d1, d2, d3, d4, d5, s1, s2, s3, s4, s5};
		Dog[] dogs = {d1, d2, d3, d4, d5};
		Snake[] snakes = {s1, s2, s3, s4, s5};
		
		printArray(pets);
		Arrays.sort(pets);
		printArray(pets);

		printArray(dogs);
		Arrays.sort(dogs);
		printArray(dogs);

		printArray(snakes);
		Arrays.sort(snakes);
		printArray(snakes);

	}

	// Print Array Method
	public static void printArray(Pet[] pets)
	{
		for(Pet p : pets)
		{
			System.out.println(p);
		}
		System.out.println();
	}
}
