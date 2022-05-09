package Destination;

public class Country implements IDestination  {

    private final float taxes;

    public Country(float taxes) {
        this.taxes = taxes;
    }

    @Override
    public float getDistanceInMeters() {
        return 800000;
    }

    @Override
    public float getTaxes() {
        return taxes;
    }
}
