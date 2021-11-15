package Unit1.Circle;

public class Circle{
    private double radius;
    private int x;
    private int y;

    public Circle(double radius, int x, int y){
        if (radius > 0){
            this.radius = radius;
        } else {
            this.radius = 1;
        }
        if (x >= 0){
            this.x = x;
        } else {
            this.x = 0;
        }
        if (y >= 0){
            this.y = y;
        } else {
            this.y = 0;
        }
    }

    public Circle(){
        this.radius = 1.0;
        this.x = 0;
        this.y = 0;
    }

    public void setRadius(double radius){
        if (radius > 0){
            this.radius = radius;
        }
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference(){
        return this.radius * 2 * Math.PI;
    }
    
    public void setX(int x){
        if (x >= 0){
            this.x = x;
        }
    }

    public int getX(){
        return this.x;
    }

    public void setY(int y){
        if (y >= 0){
            this.y = y;
        }
    }

    public int getY(){
        return this.y;
    }
}