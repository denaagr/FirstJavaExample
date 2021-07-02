package se.lexicon.inharitance;

public class Truck extends Vehicle{
    private int maxSpeed;
    private int maxWeight;

    public Truck(int maxSpeed, int maxWeight) {
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void drive() {

    }
}
