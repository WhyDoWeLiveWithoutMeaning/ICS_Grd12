package Unit1.ConeClass;

public class Conetester {
    public static void main(String[] args) {

        Cone c1 = new Cone();
        Cone c2 = new Cone(45.7, 67.9);
        Cone c3 = new Cone(c1);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
