package decoratordesignpattern;

/**
 * Color on the Vehicle 
 * @author
 */
public class Paint extends VehicleDecorator {
    /**
     * instance of Paint that is of type Vehicle
     */
    Vehicle vehicle;

    /**
     * passes vehicle to Vehicle
     * @param vehicle instance of Paint which extends VehicleDecorator
     */
    public Paint(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    /**
     * description of vehicle 
     * @return String that describes the vehicle and adds decoration description
     */
    public String toString(){
        return vehicle.toString() + ", fancy paint";
    }

    /**
     * cost of the vehicle 
     * @return double value for cost of vehicle and adds decoration price
     */
    public double getCost(){
        return vehicle.getCost() + 150;
    }
}
