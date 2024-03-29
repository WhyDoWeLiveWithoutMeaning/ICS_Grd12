package Unit2.ComparableAssignment;

/*Dog extends the abstract class Pet*/
public class Snake extends Pet
{
	private int length;
	
	public Snake(String name, int length)
	{
		super(name);
		this.length = length;
	}
	
	public int getLength()
	{
		return length;
	}
	
	/*speak() is abstract in Pet class, this method must be implemented 
	  in order to satisfy the requirements of the Pet class.*/
	public String speak()
	{
		return "Ssss ssss!";
	}
	
	/*move() is abstract in Pet class and must be implemented here*/
	public String move()
	{
		return "slither";
	}

	public String toString()
	{
		return "Snake: " + super.toString() + " length: " + length;
	}

	@Override
	public int compareTo(Pet p){
		if (p instanceof Snake){
			Snake s = (Snake) p;
			int name = this.length - s.length;
			if(name == 0){
				return super.compareTo(s);
			} else {
				return name;
			}
		} else {
			return super.compareTo(p);
		}
	}
}
