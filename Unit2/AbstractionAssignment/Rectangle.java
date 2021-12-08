package Unit2.AbstractionAssignment;

public class Rectangle extends Shape2D{

    private int left;
    private int bottom;

    public Rectangle() {
        super();
        this.left = 0;
        this.bottom = 0;
    }
    
    public Rectangle(double length, double width, int left, int bottom) {
        super(length, width);
        this.left = left;
        this.bottom = bottom;
    }
    
    public int getLeft() {
        return this.left;
    }

    public int getBottom(){
        return this.bottom;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }
    
    @Override
    public String toString() {
        return "Rectangle: " + super.toString() + ", left: " + this.left + ", bottom: " + this.bottom;
    }

    public double getArea() {
        return this.getLength() * this.getWidth();
    }
    
}
