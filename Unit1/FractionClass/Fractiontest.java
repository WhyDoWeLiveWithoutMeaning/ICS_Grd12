package Unit1.FractionClass;

public class Fractiontest {
    public static void main(String[] args){
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction(f1);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        System.out.println(f1.equals(f2));
        System.out.println(f1.equals(f3));

        System.out.println("f1: " + f1.doubleValue());
        System.out.println("f2: " + f2.doubleValue());
        System.out.println("f3: " + f3.doubleValue());

        f1.setNum(1);
        f1.setDen(2);
        f2.setNum(1);
        f2.setDen(3);
        f3.setNum(2);
        f3.setDen(4);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        System.out.println("f1: " + f1.doubleValue());
        System.out.println("f2: " + f2.doubleValue());
        System.out.println("f3: " + f3.doubleValue());

        f3.reduce();

        System.out.println(f3);

        System.out.println(f1.add(f2));
        System.out.println(f1.subtract(f2));
        System.out.println(f1.multiply(f2));
        System.out.println(f1.divide(f2));
    }
}
