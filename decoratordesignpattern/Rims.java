package decoratordesignpattern;

/**
 * Rims added onto the Vehicle
 * @author Ivon Nguyen
 */
public class Rims extends VehicleDecorator {

    /**
     * instance of Rims that is of type Vehicle
     */
    Vehicle vehicle;

    /**
     * passes vehicle to Vehicle
     * @param vehicle instance of Rims which extends VehicleDecorator
     */
    public Rims(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    /**
     * description of vehicle 
     * @return String that describes the vehicle and adds decoration description
     */
    public String toString(){
        return vehicle.toString() + ", cool rims";
    }

    /**
     * cost of the vehicle 
     * @return double value for cost of vehicle and adds decoration price
     */
    public double getCost(){
        return vehicle.getCost() + 200;
    }
}

