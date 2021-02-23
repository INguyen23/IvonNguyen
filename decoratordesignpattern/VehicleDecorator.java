package decoratordesignpattern;

/**
 * A class that tells what kind of added peripherals to add to the vehicle
 * @author Ivon Nguyen
 */
public abstract class VehicleDecorator extends Vehicle {
    
    /**
     * makes a string description of the specific vehicle decoration
     */
    public abstract String toString();
}
