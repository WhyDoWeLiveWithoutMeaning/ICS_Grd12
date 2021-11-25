package Unit1.OOPPractice;

public class TestPackage
{
	public static void main(String[] args)
	{
		PackageEB p1 = new PackageEB();
		PackageEB p2 = new PackageEB(4.7,"F");
		PackageEB p3 = new PackageEB(p1);
		
		System.out.println("Is p1 equal to p3? " + p1.equals(p3));
		
		p3.setWeight(-99.9);
		System.out.println(p3.getWeight());
		p3.setWeight(4.0);
		
		System.out.println("Is p1 equal to p3? " + p1.equals(p3));
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("Cost to ship p1 is " + p1.shipCost());
		System.out.println("Cost to ship p2 is " + p2.shipCost());
		System.out.println("Cost to ship p3 is " + p3.shipCost());
	}
}
