package mytest;

public class Truck extends Vehicle implements Driveable{
    public Truck(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }
}
