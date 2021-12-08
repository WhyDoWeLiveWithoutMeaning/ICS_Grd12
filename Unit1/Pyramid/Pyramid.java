package Unit1.Pyramid;

/**
 * Pyramid Class - Represents a pyramid
 * @author Eric Beaulne
 */

public class Pyramid implements Comparable<Pyramid> {

    // Variables
    private double length;
    private double width;
    private double height;

    // Constructors
    public Pyramid() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }

    public Pyramid(double length, double width, double height) {
        if (length <= 0.0){
            this.length = 1.0;
        } else {
            this.length = length;
        }
        if (width <= 0.0){
            this.width = 1.0;
        } else {
            this.width = width;
        }
        if (height <= 0.0){
            this.height = 1.0;
        } else {
            this.height = height;
        }
    }

    public Pyramid(Pyramid p) {
        this.length = p.length;
        this.width = p.width;
        this.height = p.height;
    }

    // Getters
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    // Setters
    public void setLength(double length) {
        if (length > 0.0){
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (width > 0.0){
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height > 0.0){
            this.height = height;
        }
    }

    // Methods
    public double getVolume() {
        return (this.length * this.width * this.height) / 3.0;
    }

    @Override
    public String toString() {
        return "Pyramid [length=" + this.length + ", width=" + this.width + ", height=" + this.height + "]";
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Pyramid)) return false;

        Pyramid p = (Pyramid) o;

        return (this.length == p.length && this.width == p.width && this.height == p.height);
    }

    @Override
    public int compareTo(Pyramid p) {
        if (this.getVolume() > p.getVolume()){
            return 1;
        } else if (this.getVolume() < p.getVolume()){
            return -1;
        } else {
            return 0;
        }
    }
} 