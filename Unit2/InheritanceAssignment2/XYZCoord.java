package Unit2.InheritanceAssignment2;
/**
 * This class represents a point in the plane with an x, y and z coordinate.
 * @author Eric Beaulne
 */

public class XYZCoord extends XYCoord {
    
    // Z coordinate
    private int z;

    /**
     * Constructor for objects of class XYZCoord
     * Default constructor
     */
    public XYZCoord(){
        super();
        this.z = 0;
    }

    /**
     * Constructor for objects of class XYZCoord
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
    public XYZCoord(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    /**
     * Constructor for objects of class XYZCoord
     * @param xyz the xyz coordinate
     */
    public XYZCoord(XYZCoord xyz) {
        super(xyz);
        this.z = xyz.z;
    }

    /**
     * Getter for the z coordinate
     */
    public int getZ() {
        return this.z;
    }

    /**
     * Setter for the z coordinate
     * @param z the z coordinate
     */
    public void setZ(int z) {
        this.z = z;
    }

    /**
     * The distance between this point and another point.
     * @param p XYZCoord the other point
     * @return the distance between this point and the other point
     */
    public double distance(XYZCoord p){
        return Math.sqrt(Math.pow(this.getX() - p.getX(), 2) + Math.pow(this.getY() - p.getY(), 2) + Math.pow(this.getZ() - p.getZ(), 2));
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Z->" + this.z;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof XYZCoord){
            XYZCoord p = (XYZCoord) o;
            return super.equals(p) && this.z == p.z;
        }
        return false;
    }
}
