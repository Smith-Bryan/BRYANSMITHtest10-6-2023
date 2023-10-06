package mytest;

public class Car extends Vehicle implements Driveable{
    private int numOfDoors;
    private float extraTax = .5f;

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public float getExtraTax() {
        return extraTax;
    }

    public void setExtraTax(float extraTax) {
        this.extraTax = extraTax;
    }

    public Car(String name, int speed, float price, Engine engine, int numOfDoors, float extraTax) {
        super(name, speed, price, engine);
        this.numOfDoors = numOfDoors;
        this.extraTax = extraTax;
    }
    public static void printNumOfDoors(){}
}
