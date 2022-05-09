package Courier;

public class MotorcycleService extends CourierService {

    final float driverTax = 0.10f;

    public MotorcycleService(float baseValue) {
        super(baseValue);
    }

    @Override
    public float calcTotalValue() {
        float total = this.baseValue * (destination.getDistanceInMeters() / 1000);
        return (total + (total * (driverTax + this.destination.getTaxes())));
    }
}
