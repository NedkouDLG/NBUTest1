public class Vehicle {
    protected double price;
    protected VehicleType vehicleType;
    protected double tankVolume;

    public Vehicle(){
        this.price = 0.0;
        tankVolume = 0.0;
    }
    public Vehicle(double price, VehicleType vehicleType, double tankVolume) {
        this.price = price;
        this.vehicleType = vehicleType;
        this.tankVolume = tankVolume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }
    public void increasePrice(double price){
        this.price += price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", vehicleType=" + vehicleType +
                ", tankVolume=" + tankVolume +
                '}';
    }
}
