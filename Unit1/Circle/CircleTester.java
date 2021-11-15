package Unit1.Circle;

public class CircleTester {
    public static void main(String[] args) {
        Circle c1 = new Circle(12.5, 200, 67);
        System.out.println(c1.getRadius());
        System.out.println(c1.getX());
        System.out.println(c1.getY());

        Circle c2 = new Circle();
        c2.setRadius(45.0);

        System.out.println(c2.getRadius());
        System.out.println(c2.getX());
        System.out.println(c2.getY());
    }
}
