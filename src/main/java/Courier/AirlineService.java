package Courier;

public class AirlineService extends CourierService {
    final float logisticTax = 0.025f;
    final float secureTax = 0.010f;

    public AirlineService(float baseValue) {
        super(baseValue);
    }

    @Override
    public float calcTotalValue() {
        float total = this.baseValue * (destination.getDistanceInMeters() / 1000);
        return (total + (total * (logisticTax + secureTax + this.destination.getTaxes()))) / 10;
    }
}
