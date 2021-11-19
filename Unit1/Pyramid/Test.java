package Unit1.Pyramid;

public class Test {
    public static void main(String[] args){
        Pyramid p1 = new Pyramid();
        Pyramid p2 = new Pyramid(2.0, 3.0, 4.0);
        Pyramid p3 = new Pyramid(p2);

        System.out.println("p1: " + p1.getLength() + " " + p1.getWidth() + " " + p1.getHeight());
        System.out.println("p2: " + p2.getLength() + " " + p2.getWidth() + " " + p2.getHeight());
        System.out.println("p3: " + p3.getLength() + " " + p3.getWidth() + " " + p3.getHeight());
        p1.setLength(5.0);
        p1.setWidth(-6.0);
        p1.setHeight(7.0);
        System.out.println("p1: " + p1.getLength() + " " + p1.getWidth() + " " + p1.getHeight());

        System.out.println("p1 volume: " + p1.getVolume());
        System.out.println("p2 volume: " + p2.getVolume());
        System.out.println("p3 volume: " + p3.getVolume());

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);

        System.out.printf("Does P1 == P2: %b\n", p2.equals(p1));
        System.out.printf("Does P2 == P3: %b\n", p2.equals(p3));

        System.out.println("P1 compared to P2: " + p2.compareTo(p1));
    }
}
