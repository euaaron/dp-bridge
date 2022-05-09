package Courier;

import Destination.IDestination;

public abstract class CourierService {
    protected IDestination destination;
    protected float baseValue;

    public CourierService(float baseValue) {
        this.baseValue = baseValue;
    }

    public void setDestination(IDestination destination) { this.destination = destination; }

    public abstract float calcTotalValue();
}
