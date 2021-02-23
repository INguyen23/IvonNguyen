package decoratordesignpattern;

/**
 * Smaller family car
 * @author Ivon Nguyen
 */
public class Compact extends Vehicle {
    /**
     * describes the vehicle as Compact
     */
    public Compact() {     //sets description to Compact
        this.description = "Compact Car";
    }

    /**
     * gets the cost of the vehicle
     * @return a double amount of the vehicle 
     */
    public double getCost(){       //return car cost
        return 15000;
    }
}
