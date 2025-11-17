// Parent class
class Vehicle {
    String make, model;
    int year, maximumSpeed;

    // Constructor
    Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    void drive() {
        System.out.println(make + " " + model + " Vehicle is driving.");
    }
}

// Subclass Car
class Car extends Vehicle {

    Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

// Subclass Bike
class Bike extends Vehicle {

    Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

public class Assignment1 {
    public static void main(String[] args) {

        Car car = new Car("Honda", "City", 2020, 180);
        Bike bike = new Bike("Yamaha", "FZ", 2019, 140);

        car.drive();
        bike.drive();

        System.out.println("Car Details: " + car.make + " " + car.model + ", Year: " + car.year);
        System.out.println("Bike Details: " + bike.make + " " + bike.model + ", Year: " + bike.year);
    }
}