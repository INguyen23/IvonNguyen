package decoratordesignpattern;

/**
 * Speakers added into the vehicle
 * @author Ivon Nguyen
 */
public class SoundSystem extends VehicleDecorator {
     /**
     * instance of SoundSystem that is of type Vehicle
     */
    Vehicle vehicle;

    /**
     * passes vehicle to Vehicle
     * @param vehicle instance of SoundSystem which extends VehicleDecorator
     */
    public SoundSystem(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    /**
     * description of vehicle 
     * @return String that describes the vehicle and adds decoration description
     */
    public String toString(){
        return vehicle.toString() + ", awesome sound";
    }

    /**
     * cost of the vehicle 
     * @return double value for cost of vehicle and adds decoration price
     */
    public double getCost(){
        return vehicle.getCost() + 350;
    }
}
