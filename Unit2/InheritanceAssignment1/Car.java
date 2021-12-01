package Unit2.InheritanceAssignment1;

public class Car extends Vehicle {
    
    private String model;
    private int odometer = 0;

    public Car(int vin, String manufacturer, String dateOfManufacture, String model){
        super(vin, manufacturer, dateOfManufacture);
        this.model = model;
    }

    public Car(){
        super();
        this.model = "Undefined";
        this.odometer = 0;
    }

    public String getModel(){
        return this.model;
    }

    public int getOdometer(){
        return this.odometer;
    }

    @Override
    public String toString(){
        return "Car--> " + super.toString() + ", Model: " + this.model + ", Odometer: " + this.odometer;
    }
}
