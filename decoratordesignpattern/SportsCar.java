package decoratordesignpattern;

/**
 * More expensive Vehicle
 * @author Ivon Nguyen
 */
public class SportsCar extends Vehicle {
    /**
     * describes vehicle as Sports Car
     */
    public SportsCar(){
        this.description = "Sports Car";
    }

    /**
     * Gets the cost of the Vehicle
     * @return a double amount of the vehicle
     */
    public double getCost(){    //retrun car cost
        return 30000;
    }
}
