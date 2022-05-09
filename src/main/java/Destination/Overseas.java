package Destination;

public class Overseas implements IDestination {
    private final float taxes;

    public Overseas(float taxes) {
        this.taxes = taxes;
    }

    @Override
    public float getDistanceInMeters() {
        return 8000000;
    }

    @Override
    public float getTaxes() {
        return taxes;
    }
}
