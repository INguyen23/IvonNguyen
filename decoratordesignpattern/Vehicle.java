package decoratordesignpattern;

/**
 * A Vehicle in the Car Lot 
 * @author Ivon Nguyen
 */
public abstract class Vehicle{
    protected String description;

    /**
     * Makes string description of the Vehicle
     * @return a string description of the vehicle
     */
    public String toString() {
        return description;
    }

    /**
     * abstract method that must be implemented in children classes
     */
    public abstract double getCost(); //force children to implpement getCost method
}