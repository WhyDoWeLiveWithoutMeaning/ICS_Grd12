package Unit2.InheritanceAssignment2;
/**
 * This class represents a point in the plane with x and y coordinates.
 * @author Eric Beaulne
 */


public class XYCoord {

    // XY Coordinates
    private int x;
    private int y;

    /**
     * Constructor for objects of class XYCoord
     * Default constructor
     */
    public XYCoord(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructor for objects of class XYCoord
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public XYCoord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor for obkects of class XYCoord
     * @param p the point to clone
     */
    public XYCoord(XYCoord p){
        this.x = p.x;
        this.y = p.y;
    }

    /**
     * Getter for x-coordinate
     * @return x-coordinate
     */
    public int getX() {
        return this.x;
    }

    /**
     * Setter for x-coordinate
     * @param x x-coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Getter for y-coordinate
     * @return y-coordinate
     */
    public int getY() {
        return this.y;
    }

    /**
     * Setter for y-coordinate
     * @param y y-coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Getter for the distance between two points
     * @param p the point to calculate the distance to
     * @return the distance between the two points
     */
    public double distance(XYCoord p){
        return Math.sqrt(Math.pow(this.getX() - p.getX(), 2) + Math.pow(this.getY() - p.getY(), 2));
    }

    @Override
    public String toString(){
        return "Point: X->" + this.getX() + ", Y->" + this.getY();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof XYCoord){
            XYCoord p = (XYCoord) obj;
            return this.getX() == p.getX() && this.getY() == p.getY();
        }
        return false;
    }
}
