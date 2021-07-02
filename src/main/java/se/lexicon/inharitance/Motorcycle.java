package se.lexicon.inharitance;

public class Motorcycle extends Vehicle{
    private String motorcycleType;

    public Motorcycle(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    @Override
    public void drive() {

    }
}
