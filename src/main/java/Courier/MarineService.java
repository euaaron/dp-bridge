package Courier;

public class MarineService extends CourierService {

    float logisticTax = 0.022f;
    float secureTax = 0.025f;

    public MarineService(float baseValue) {
        super(baseValue);
    }

    @Override
    public float calcTotalValue() {
        float total = this.baseValue * (destination.getDistanceInMeters() / 1000);
        return (total + (total * (logisticTax + secureTax + this.destination.getTaxes()))) / 10;
    }
}
