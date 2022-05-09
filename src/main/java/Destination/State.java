package Destination;

public class State implements IDestination {

    private final float taxes;

    public State(float taxes) {
        this.taxes = taxes;
    }

    @Override
    public float getDistanceInMeters() {
        return 80000;
    }

    @Override
    public float getTaxes() {
        return taxes;
    }
}
