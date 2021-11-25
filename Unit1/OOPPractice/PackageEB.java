package Unit1.OOPPractice;

public class PackageEB {

    // Shipping Prices
    public static final double REGULAR = 0.50;
    public static final double UPS = 1.50;
    public static final double FEDEX = 2.50;

    // Package goes over weight
    public static final double TOOBIG = 3.50;

    // Class Object Variables
    private double weight;
    private String shipMethod;

    // Constructor with no parameters
    public PackageEB() {
        this.weight = 0;
        this.shipMethod = "R";
    }

    // Constructor with Weight and Shipping Method
    public PackageEB(double weight, String shipMethod){
        this.weight = weight >= 0.0 ? weight : 0;
        this.shipMethod = shipMethod.equals("R") || shipMethod.equals("U") || shipMethod.equals("F") ? shipMethod : "R";
    }

    // Contructor that Accepts PackageEB Object
    public PackageEB(PackageEB other){
        this.weight = other.weight;
        this.shipMethod = other.shipMethod;
    }

    // Accessor
    public double getWeight(){
        return this.weight;
    }

    // Mutator
    public void setWeight(double weight){
        if (weight >= 0.0) this.weight = weight;
    }

    // Calculate the shipping cost of the package
    public double shipCost(){

        double price;
        double cost;

        if(this.shipMethod.equals("R"))
            price = REGULAR;
        else if (this.shipMethod.equals("U"))
            price = UPS;
        else
            price = FEDEX;

        cost = price * this.weight;

        if (this.weight > 4.0) 
            cost += TOOBIG;

        return cost;
    }

    // toString Method
    @Override
    public String toString(){
        //Creating Strings
        String weightAmount = String.format("Weight: %.2f", this.weight);
        String shippingCost = String.format("Shipping Cost: %.2f", this.shipCost());
        String shippingMethod = "Shipping Method: ";
        if (this.shipMethod.equals("R"))
            shippingMethod += "Regular";
        else if (this.shipMethod.equals("U"))
            shippingMethod += "UPS";
        else
            shippingMethod += "FedEx";

        //Calculating length
        int length = Math.max(weightAmount.length(), Math.max(shippingCost.length(), shippingMethod.length())) + 2;

        //Creating Box
        String finalStr = "";

        // Top
        for(int i = 0; i < length; i++) finalStr += "-";
        finalStr += "\n";
        // First Row
        finalStr += "|";
        int spaces = ((length-2) - weightAmount.length())/2;
        for(int i = 0; i < spaces; i++) finalStr += " ";
        finalStr += weightAmount;
        for(int i = 0; i < spaces; i++) finalStr += " ";
        finalStr += "|\n";
        // Second Row
        finalStr += "|";
        spaces = ((length-2) - shippingMethod.length())/2;
        for(int i = 0; i < spaces; i++) finalStr += " ";
        finalStr += shippingMethod;
        for(int i = 0; i < spaces; i++) finalStr += " ";
        finalStr += "|\n";
        // Third Row
        finalStr += "|";
        spaces = ((length-2) - shippingCost.length())/2;
        for(int i = 0; i < spaces; i++) finalStr += " ";
        finalStr += shippingCost;
        for(int i = 0; i < spaces; i++) finalStr += " ";
        finalStr += "|\n";
        // Bottom
        for(int i = 0; i < length; i++) finalStr += "-";

        // Return Constructed String
        return finalStr;
    }
    
    // equals Method
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof PackageEB)) return false;
        PackageEB p = (PackageEB) o;
        return (this.weight == p.weight && this.shipMethod.equals(p.shipMethod));
    }
}
