package mytest;

public class Drone implements Flyable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean transportsPassengers() {
        return false;
    }
}