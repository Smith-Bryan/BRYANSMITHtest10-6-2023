package mytest;

public class Boat extends Vehicle implements Driveable{
    private boolean hasGps;

    public boolean isHasGps() {
        return hasGps;
    }

    public void setHasGps(boolean hasGps) {
        this.hasGps = hasGps;
    }
    public Boat(String name, int speed, float price, Engine engine,boolean hasGps) {
        super(name, speed, price, engine);
        this.hasGps = hasGps;
    }
    public static void printGpsInfo(){}

}
