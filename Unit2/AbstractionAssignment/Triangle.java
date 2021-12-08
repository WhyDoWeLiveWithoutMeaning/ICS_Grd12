package Unit2.AbstractionAssignment;

public class Triangle extends Shape2D{

    public Triangle(){
        super();
    }

    public Triangle(double length, double width){
        super(length, width);
    }

    @Override
    public String toString(){
        return "Triangle: " + super.toString();
    }

    public double getArea(){
        return (this.getLength() * this.getWidth()) / 2;
    }
    
}
