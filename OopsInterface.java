interface Vehicle {
    void start();
    void stop();
    void fuelType();
}

abstract class BaseVehicle {
    private String brand;
    private int speed;

    // Encapsulation via getters/setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }
    //specialized method
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + "km/h");
    }
}


// Child class that inherits BaseVehicle and implements Vehicle
class Car extends BaseVehicle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started with key.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public void fuelType() {
        System.out.println("Car uses petrol.");
    }
}


class Bike extends BaseVehicle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started with self-start.");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped.");
    }

    @Override
    public void fuelType() {
        System.out.println("Bike uses diesel.");
    }
}
public class OopsInterface {
   
        public static void main(String[] args) {
            // Polymorphism: using interface reference
            Vehicle car = new Car(); // Upcasting
            Vehicle bike = new Bike();

            ((Car) car).setBrand("Toyota");  //downcasting
            ((Car) car).setSpeed(120);

            ((Bike) bike).setBrand("Royal Enfield");
            ((Bike) bike).setSpeed(80);

            // Display details
            System.out.println("=== Car Details ===");
            ((Car) car).displayInfo();  // BaseVehicle method
            car.start();                // Interface method
            car.fuelType();
            car.stop();

            System.out.println("\n== Bike Details ===");
            ((Bike) bike).displayInfo();
            bike.start();
            bike.fuelType();
            bike.stop();
    }
}

//OUTPUT

// PS C:\AsarIt_Internship> javac OopsInterface.java
// PS C:\AsarIt_Internship> java OopsInterface
// === Car Details ===
// Brand: Toyota, Speed: 120km/h
// Car started with key.
// Car uses petrol.
// Car stopped.

