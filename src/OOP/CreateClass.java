package OOP;

// Defining the Car class
class Car {
    // Attributes
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayCarInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
    }
}

public class CreateClass {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Toyota", "Corolla", 2022);
        
        // Displaying car details
        myCar.displayCarInfo();
    }
}
