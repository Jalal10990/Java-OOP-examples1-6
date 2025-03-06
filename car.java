// Car class in Java
class Car {
    // Data members (attributes)
    private String brand;
    private String model;
    private int year;
    private String color;
    private int speed;
    private double fuelLevel;

    // Constructor to initialize car details
     Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.speed = 0; // Default speed is 0
        this.fuelLevel = 100; // Default fuel level is full (100%)
    }

    // Method to start the car
    public void startCar() {
        System.out.println(brand + " " + model + " is started.");
    }

    // Method to stop the car
    public void stopCar() {
        speed = 0;
        System.out.println(brand + " " + model + " is stopped.");
    }

    // Method to accelerate the car
    public void accelerate(int increaseSpeed) {
        if (fuelLevel > 0) {
            speed += increaseSpeed;
            fuelLevel -= 5; // Decrease fuel level by 5% for every acceleration
            System.out.println(brand + " " + model + " accelerated to " + speed + " km/h.");
        } else {
            System.out.println("Fuel empty! Please refuel.");
        }
    }

    // Method to apply brakes
    public void brake(int decreaseSpeed) {
        speed -= decreaseSpeed;
        if (speed < 0) speed = 0; // Speed cannot be negative
        System.out.println(brand + " " + model + " slowed down to " + speed + " km/h.");
    }

    // Method to refuel the car
    public void refuel(double amount) {
        fuelLevel += amount;
        if (fuelLevel > 100) fuelLevel = 100; // Max fuel is 100%
        System.out.println("Car refueled. Current fuel level: " + fuelLevel + "%.");
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("Fuel Level: " + fuelLevel + "%");
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Toyota", "Corolla", 2022, "Red");

        // Displaying initial car details
        myCar.displayInfo();

        // Starting the car
        myCar.startCar();

        // Accelerating the car
        myCar.accelerate(20);
        myCar.accelerate(30);

        // Applying brakes
        myCar.brake(15);

        // Refueling the car
        myCar.refuel(20);

        // Stopping the car
        myCar.stopCar();

        // Displaying final car details
        myCar.displayInfo();
    }
}
