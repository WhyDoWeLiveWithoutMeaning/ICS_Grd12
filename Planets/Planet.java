package Planets;

public class Planet implements Comparable<Planet> {

    private String name;
    private double mass;
    private double radius;

    public Planet(){
        this.name = "";
        this.mass = 0;
        this.radius = 0;
    }

    public Planet(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass(){
        return this.mass;
    }

    public void setMass(double mass){
        if (mass > 0){
            this.mass = mass;
        }
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        if (radius > 0){
            this.radius = radius;
        }
    }

    public double getDiameter(){
        return this.radius * 2;
    }

    public double getVolume(){
        return (4.0/3.0) * Math.PI * Math.pow(this.radius, 3);
    }

    public double getSurfaceArea(){
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

    public int compareTo(Planet other){
        double mass = this.mass - other.mass;
        if (mass == 0.0){
            return this.name.compareTo(other.name);
        }
        return (int) mass;
    }

}
