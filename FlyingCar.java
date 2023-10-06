package mytest;

public class FlyingCar extends Vehicle implements Flyable,Driveable{

    public FlyingCar(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }
    /* name Model A
     price 300,000
     speed 25 mph
     transports passengers
     road range of 200 miles and flying range of 110 miles

     */

    @Override
    public boolean transportsPassengers() {
        return true;

    }
}
