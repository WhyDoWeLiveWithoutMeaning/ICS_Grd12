package Unit2.AbstractionAssignment;

public class ShapeTest {

    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5.0, 10.0, 2, 4);

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(5.0, 10.0);

        Shape2D[] shapes = new Shape2D[20];
        for(int i = 0; i < shapes.length; i++){
            double length = (Math.random() * 200) - 99, width = (Math.random() * 200) - 99;
            if((int)(Math.random() * 11) < 5){
                shapes[i] = new Rectangle(length, width, (int)(Math.random() * 100), (int)(Math.random() * 100));
            }
            else{
                shapes[i] = new Triangle(length, width);
           }
        }

        for (Shape2D s : shapes){
            System.out.println(s);
        }

        for (Shape2D s : shapes){
            if (s instanceof Rectangle)
                System.out.println("Area of " + s + " is " + s.getArea());
        }

    }

}
