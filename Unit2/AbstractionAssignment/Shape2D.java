package Unit2.AbstractionAssignment;

public abstract class Shape2D {

    private double length;
    private double width;

    public Shape2D(){
        length = width = 1;
    }

    public Shape2D(double length2, double width2){
        this.length = length2;
        this.width = width2;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public String toString(){
        return "Length: " + this.length + ", Width: " + this.width;
    }

    abstract public double getArea();
    
}
