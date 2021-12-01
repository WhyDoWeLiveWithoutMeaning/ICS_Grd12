package Unit2.InheritanceAssignment1;

class Vehicle{

    private int vin;
    private String manufacturer;
    private String dateOfManufacture;

    public Vehicle(int vin, String manufacturer, String dateOfManufacture) {
        this.vin = vin;
        this.manufacturer = manufacturer;
        this.dateOfManufacture = dateOfManufacture;
    }

    public Vehicle(){
        this.vin = 0;
        this.manufacturer = "Undefined";
        this.dateOfManufacture = "Undefined";
    }

    // Getters
    public int getVin() {
        return this.vin;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getDateOfManufacture() {
        return this.dateOfManufacture;
    }

    @Override
    public String toString() {
        return "Vin: " + this.vin + ", Manufacturer: " + this.manufacturer + ", Date of Manufacture: " + this.dateOfManufacture;
    }

}