public class Solution {
    public static void main(String[] args) {
        CarStore[] stores = {
                new CarStore("AutoStar"),
                new CarStore("SilverStar"),
                new CarStore("AutoBavaria"),
                new CarStore("AutoStenley"),
                new CarStore("KiaMotors")
        };

        stores[0].addVehicle(new Car(5000,VehicleType.SPORTCAR,55,11,"VW","GOLF"));
        stores[0].addVehicle(new Car(11500,VehicleType.FAMILYCAR,60,7.2,"VW","SHARAN"));
        stores[0].addVehicle(new Car(15000,VehicleType.PICKUP,90,18.6,"FORD","F150"));
        
        stores[1].addVehicle(new Car(19000,VehicleType.FAMILYCAR,55,8.3,"MERCEDES","C-class"));
        stores[1].addVehicle(new Car(80440,VehicleType.FAMILYCAR,60,11.3,"MERCEDES","G-class"));
        
        stores[2].addVehicle(new Car(11500,VehicleType.FAMILYCAR,55,9.5,"BMW","535d"));
        stores[2].addVehicle(new Car(34000,VehicleType.SPORTCAR,60,7.2,"BMW","440i"));

        stores[3].addVehicle(new Car(5000,VehicleType.FAMILYCAR,55,6.3,"Opel","Astra"));
        stores[3].addVehicle(new Car(8300,VehicleType.FAMILYCAR,60,6.8,"VW","SHARAN"));

        stores[4].addVehicle(new Car(6000,VehicleType.FAMILYCAR,40,9,"Kia","Ceed"));
        stores[4].addVehicle(new Car(18000,VehicleType.PICKUP,60,8.8,"Kia","Sorento"));

        double sumOfCars = 0.0;
        CarStore tempStore = new CarStore();
        for (CarStore carStore:stores) {
            if(carStore.sumPriceOfCars() > sumOfCars){
                sumOfCars = carStore.sumPriceOfCars();
                tempStore = carStore;
            }
        }
        System.out.println();
        System.out.println("CarStore with maxPrice: ");
        System.out.println(tempStore.toString());
        Car tempCar = new Car();
        double tempMaxDistance = 0.0;
        for (Car car:tempStore.getCarsInStore()) {
            if(car.maxDistance()>tempMaxDistance){
                tempMaxDistance = car.maxDistance();
                tempCar = car;
            }
        }
        System.out.println();
        System.out.println("Car with max distance: ");
        System.out.println(tempCar.toString());
    }
}
