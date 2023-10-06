package mytest;

public abstract class Vehicle extends Product{
    private int speed;
    private double price;
    Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    protected final float TAX_AMOUNT =.10f;
    public Vehicle(String name, int speed, float price, Engine engine) {
        super(name);
       this.engine = engine;
        this.speed = speed;
        this.price = (float) price;

    }
public static void printVehicleType(){}
    public double getPriceAfterTax(){
        return price * TAX_AMOUNT;
    }
}
