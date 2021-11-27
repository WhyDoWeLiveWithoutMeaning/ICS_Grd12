package Unit1.ConeClass;

public class Cone {

    private double radius;
    private double height;

    // Constructors
    public Cone() {
        this.radius = 1;
        this.height = 1;
    }

    /**
     * Constructor that takes radius and height and sets them to the instance only if they are bigger than 0.0 else they are set to 1
     * @param radius the radius of the cone
     * @param height the height of the cone
     */
    public Cone(double radius, double height) {
        if (radius > 0.0) {
            this.radius = radius;
        } else {
            this.radius = 1;
        }
        if (height > 0.0) {
            this.height = height;
        } else {
            this.height = 1;
        }
    }

    /**
     * Constructor that takes another Cone object and creates a new copy
     * @param c the Cone object to be copied
     */
    public Cone(Cone c) {
        this.radius = c.radius;
        this.height = c.height;
    }

    // Getters and Setters
    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0.0) {
            this.radius = radius;
        }
    }

    public void setHeight(double height) {
        if (height > 0.0) {
            this.height = height;
        }
    }

    // toString Method
    @Override
    public String toString() {
        return "Cone--> radius: " + this.radius + "   height: " + this.height;
    }

    
}
