package Unit2.ComparableAssignment;

/*class is made abstract (Pet objects cannot be created)*/
public abstract class Pet implements Comparable<Pet>
{
	/*all Pets have a name*/
	private String name;
	
	/*constuctor*/
	public Pet(String name)
	{
		this.name = name;
	}
	
	/*accessor method for name*/
	public String getName()
	{
		return name;
	}
	
	/*Method is made abstract.  This means that any class that extends
	  this class must impliment the speak() method.  The assumption
	  is that all Pets can speak, but they do it in different ways.*/
	abstract public String speak();
	
	/*another abstract method*/
	abstract public String move();

	@Override
	public String toString()
	{
		return "Pet[name=" + name + "]";
	}

	public int compareTo(Pet o)
	{
		return this.getName().compareTo(o.getName());
	}
}
