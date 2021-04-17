import java.util.ArrayList;
import java.util.List;

public class CarStore {
    private String name;
    private int countCars;
    private List<Car> carsInStore;
    public CarStore(){
        name = "";
        this.countCars = 0;
        this.carsInStore = new ArrayList<>();
    }

    public CarStore(String name) {
        this.name = name;
        this.countCars = 0;
        this.carsInStore = new ArrayList<>();
    }

    public CarStore(String name, int countCars, List<Car> carsInStore) {
        this.name = name;
        this.countCars = countCars;
        this.carsInStore = carsInStore;
    }
    public void addVehicle(Car vehicle){
        carsInStore.add(vehicle);
        this.countCars = carsInStore.size();
    }
    public double sumPriceOfCars(){
        double sum = 0.0;
        for (Vehicle vehicle:carsInStore) {
            sum += vehicle.getPrice();
        }
        return sum;
    }
    public Car getCar(int index){
        return carsInStore.get(index);
    }
    public Car getCarWithMaxTank(){
        double tempMaxTank = 0.0;
        Car tempVehicle = new Car();
        for (Car vehicle:carsInStore) {
            if(vehicle.getTankVolume() > tempMaxTank){
                tempMaxTank = vehicle.getTankVolume();
                tempVehicle = vehicle;
            }
        }
        return tempVehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountCars() {
        return countCars;
    }

    public void setCountCars(int countCars) {
        this.countCars = countCars;
    }

    public List<Car> getCarsInStore() {
        return carsInStore;
    }

    public void setCarsInStore(List<Car> carsInStore) {
        this.carsInStore = carsInStore;
    }

    @Override
    public String toString() {
        return "CarStore{" +
                "name='" + name + '\'' +
                ", countCars=" + countCars +
                ", allPrice="+ sumPriceOfCars() +
                '}';
    }
}
