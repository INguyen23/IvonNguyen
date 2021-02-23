package decoratordesignpattern;

/**
 * A 4 door vehicle
 * @author Ivon Nguyen
 */
public class Sedan extends Vehicle {

    /**
     * describes the vehicle as Sedan
     */
    public Sedan() {    //sets description to Sedan
        this.description = "Sedan";
    }

    /**
     * gets the cost of the vehicle
     * @return a double amount of the vehicle
     */
    public double getCost(){ 
        return 20000;
    }
}
