package Unit2.ComparableAssignment;

/*Dog extends the abstract class Pet*/
public class Dog extends Pet
{
	private int weight;
	
	public Dog(String name, int weight)
	{
		super(name);
		this.weight = weight;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	/*speak() is abstract in Pet class, this method must be implemented 
	  in order to satisfy the requirements of the Pet class.*/
	public String speak()
	{
		return "Woof!";
	}
	
	/*move() is abstract in Pet class and must be implemented here*/
	public String move()
	{
		return "run";
	}

	@Override
	public String toString()
	{
		return "Dog: " + super.toString() + " " + weight + " pounds";
	}

	public int compareTo(Dog other)
	{
		int name = super.compareTo(other);
		if(name == 0)
		{
			return this.weight - other.weight;
		}
		else
		{
			return name;
		}
	}
}
