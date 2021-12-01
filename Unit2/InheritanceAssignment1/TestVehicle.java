package Unit2.InheritanceAssignment1;

class TestVehicles
{
	public static void main(String[]args)
	{
		Vehicle v1 = new Vehicle(1,"ACME","Oct.1/2006");
		Vehicle v2 = new Vehicle(2,"ACME","Oct.7/2006");
		Vehicle v3 = new Car(3,"Pontiac","Nov.1/2006","Solstice");
		
		//this line produces a method not found error
		//System.out.println(v3.getModel());
		
		Car c1 = new Car(4,"Ford","Sept. 4/2006","GT");
		Car c2 = new Car(5,"Lada","Sept. 11/2006","Niva");
		Car c3 = new Car(6,"Toyota","Sept. 23/2006","Corola");
		
		Boat b1 = new Boat(7,"Stanley","Nov.10/2017","Baracuda",5567.0);
		Boat b2 = new Boat(8,"Grumman","Aug.23/2014","Starburst",1230.0);
		
		//this line produces an incompatible types error
		//Car c4 = new Vehicle(007,"ACME","Dec.1/2000");
		
		//print a Vehicle
		System.out.println("Here is a Vehicle Object:");
		System.out.println(v1);
		System.out.println();
		
		//print a Car
		System.out.println("Here is a Car object:");
		System.out.println(c2);
		System.out.println();
		
		//add all vehicles and cars to an array of Vehicles
		Vehicle[] vehicles = new Vehicle[8];
		vehicles[0] = v1;
		vehicles[1] = v2;
		vehicles[2] = v3;
		vehicles[3] = c1;
		vehicles[4] = c2;
		vehicles[5] = b1;
		vehicles[6] = c3;
		vehicles[7] = b2;
		
		//print all Vehicles
		System.out.println("The following objects are Vehicles:");
		for(int i = 0; i < vehicles.length; i++)
		{
				System.out.println(vehicles[i]);
		}
		System.out.println();
		
		//print all Cars
		System.out.println("The following objects are Cars:");
		for(int i = 0; i < vehicles.length; i++)
		{
			if( vehicles[i] instanceof Car)
			{
				System.out.println(vehicles[i]);
			}
		}
		
	}
}
