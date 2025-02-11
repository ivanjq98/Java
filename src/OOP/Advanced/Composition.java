package OOP.Advanced;

class Engine {
    void startEngine() {
        System.out.println("Engine is starting...");
    }
}

// Car class using Engine (Composition)
class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void startCar() {
        System.out.println("Car is starting...");
        engine.startEngine(); // Using Engine object
    }
}

public class Composition {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar();
    }
}
