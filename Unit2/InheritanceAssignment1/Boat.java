package Unit2.InheritanceAssignment1;

public class Boat extends Vehicle {

    private String model;
    private double maxWeightKg = 0.0;

    public Boat(int vin, String manufacturer, String dateOfManufacture, String model, double maxWeightKg) {
        super(vin, manufacturer, dateOfManufacture);
        this.model = model;
        this.maxWeightKg = maxWeightKg;
    }

    public Boat(){
        super();
        this.model = "Undefined";
        this.maxWeightKg = 0.0;
    }

    public String getModel() {
        return model;
    }

    public double getMaxWeightKg() {
        return maxWeightKg;
    }

    @Override
    public String toString(){
        return "Boat--> " + super.toString() + ", Model: " + model + ", maxWeightKg: " + maxWeightKg;
    }
    
}
