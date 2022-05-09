package Destination;

public class District implements IDestination {

    private final float taxes;

    public District(float taxes) {
        this.taxes = taxes;
    }

    @Override
    public float getDistanceInMeters() {
        return 2000;
    }

    @Override
    public float getTaxes() {
        return taxes;
    }
}
