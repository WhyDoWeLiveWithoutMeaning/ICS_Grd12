package Unit2.InheritanceAssignment2;

class XYZDemo
{
	public static void main(String[]args)
	{
		//create 2D points
		XYCoord a = new XYCoord();
		XYCoord b = new XYCoord(4,4);
		XYCoord c = new XYCoord(b);
		
		//create 3D points
		XYZCoord i = new XYZCoord();
		XYZCoord j = new XYZCoord(4,4,4);
		XYZCoord k = new XYZCoord(j);
		
		//test accessors
		System.out.println(c.getX() + ":" + c.getY());
		System.out.println(k.getX() + ":" + k.getY() + ":" + k.getZ());
		
		//test mutators
		c.setX(99);
		c.setY(-99);
		k.setX(0);
		k.setY(0);
		k.setZ(0);
		
		//test toString()
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		//test equals
		System.out.println("\nIs a = c? " + a.equals(c));
		System.out.println("Is a = a? " + a.equals(a));
		System.out.println("Is i = j? " + i.equals(j));
		System.out.println("Is i = k? " + i.equals(k));
		System.out.println("Is b = j? " + b.equals(j));
		System.out.println("Is j = b? " + j.equals(b));

		//test distance methods
		System.out.println("\nDistance from " + a + " to " + b + " is " + a.distance(b));
		System.out.println("Distance from " + i + " to " + j + " is " + i.distance(j));
		System.out.println("Distance from " + a + " to " + j + " is " + a.distance(j));
		System.out.println("Distance from " + j + " to " + a + " is " + j.distance(a));
		
		//create an array of XYCoords
		XYCoord[] points = new XYCoord[10];
		
		//fill with random points
		for(int index = 0; index < points.length; index++)
		{
			int x = (int)(Math.random() * 201 - 100);
			int y = (int)(Math.random() * 201 - 100);
			int z = (int)(Math.random() * 201 - 100);
			if(z >=  0)
			{
				points[index] = new XYCoord(x,y);
			}
			else
			{
				points[index] = new XYZCoord(x,y,z);
			}
		}
		
		//print random points from array
		System.out.println("\nHere's some random points");
		for(int index = 0; index < points.length; index++)
		{
			System.out.println(points[index]);
		}
		
	}
}
