package Courier;

public class CarService extends CourierService {
    final float driverTax = 0.15f;

    public CarService(float baseValue) {
        super(baseValue);
    }

    @Override
    public float calcTotalValue() {
        float total = this.baseValue * (destination.getDistanceInMeters() / 1000);
        return (total + (total * (driverTax + this.destination.getTaxes())));
    }
}
