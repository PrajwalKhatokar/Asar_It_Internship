package task2;

interface Vehicle {
    void start();
}

class Car implements Vehicle {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public void start() {
        if (fuel <= 0) {
            throw new RuntimeException("Car cannot start. Fuel tank is empty!");
        }
        System.out.println("Car is starting...");
    }
}

public class VechileTryCatch {
    public static void main(String[] args) {
        Vehicle myCar = new Car(0); // Fuel is 0

        try {
            myCar.start(); // This may throw exception
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}


//Output:
//
//Error: Car cannot start. Fuel tank is empty!
//Program continues...