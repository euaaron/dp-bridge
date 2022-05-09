package Courier;

public class TruckService extends CourierService {
    final float driverTax = 0.30f;

    public TruckService(float baseValue) {
        super(baseValue);
    }

    @Override
    public float calcTotalValue() {
        float total = this.baseValue * (destination.getDistanceInMeters() / 1000);
        return (total + (total * (driverTax + this.destination.getTaxes()))) / 10;
    }
}
