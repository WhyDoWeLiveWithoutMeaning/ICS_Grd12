package Unit2.InterfaceAssignment;

public class Person
{
	private String name;
	private java.time.LocalDate birthDate;
	
	public Person()
	{
		name = "unknown";
		birthDate = java.time.LocalDate.now();
	}
	
	public Person(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth)
	{
		this.name = name;
		birthDate = java.time.LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
	}
	
	public String getName()
	{
		return name;
	}
	
	public java.time.LocalDate getBirthDate()
	{
		return birthDate;
	}
	
	@Override
	public String toString()
	{
		return name + " [" + birthDate.toString() + "]";
	}
}
