package Destination;

public class City implements IDestination {

    private final float taxes;

    public City(float taxes) {
        this.taxes = taxes;
    }

    @Override
    public float getDistanceInMeters() {
        return 20000;
    }

    @Override
    public float getTaxes() {
        return taxes;
    }
}
