class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }
}

class Garage {
    void serviceVehicle(Vehicle vehicle) {
        vehicle.start();
        System.out.println("Vehicle serviced.\n");
    }
}

public class GarageTest {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle bike = new Motorcycle();
        Garage garage = new Garage();

        garage.serviceVehicle(car);
        garage.serviceVehicle(bike);
    }
}