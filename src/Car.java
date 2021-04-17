public class Car extends Vehicle{
    private String brand;
    private String model;
    private double consumption;
    public Car() {
        super();
        this.brand = "";
        this.consumption = 0.0;
        this.model = "";
    }

    public Car(double price, VehicleType vehicleType, double tankVolume, double consumption) {
        super(price, vehicleType, tankVolume);
        this.consumption = consumption;
    }
    public Car(double price, VehicleType vehicleType, double tankVolume, double consumption,String brand,String model) {
        super(price, vehicleType, tankVolume);
        this.consumption = consumption;
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }
    public double maxDistance(){
        double result = this.tankVolume/this.consumption*100;
        return result;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\n" + "Model: " + model + "\n"
                + "Price: " + price + "\n" + "Car type: " + vehicleType + "\n"
                + "Tank volume: " + tankVolume + "\n" + "Consumption: " + consumption + "\n"
                + "Max distance: " + maxDistance() + "km." + "\n";
    }
}
