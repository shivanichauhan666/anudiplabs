import java.util.Scanner;
class Car{
    String make;
    String model;
    short year;
    int price;
    Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

  
    void displayCarDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: ₹" + price);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of cars: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        Car[] cars = new Car[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Car " + (i + 1));
            System.out.print("Make: ");
            String make = sc.nextLine();
            System.out.print("Model: ");
            String model = sc.nextLine();
            System.out.print("Year: ");
            short year = sc.nextShort();
            System.out.print("Price: ");
            int price = sc.nextInt();
            sc.nextLine(); 
            
            cars[i] = new Car(make, model, year, price);
        }

        System.out.println("\nCar Details:");
        for (Car car : cars) {
            car.displayCarDetails();
        }

        sc.close();
    }
}