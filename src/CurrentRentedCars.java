public class CurrentRentedCars {

    public Vehicle vehicle;
    public Rental costumer;

    public CurrentRentedCars(Vehicle vehicle, Rental costumer) {
        this.vehicle = vehicle;
        this.costumer = costumer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Rental getCostumer() {
        return costumer;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setCostumer(Rental costumer) {
        this.costumer = costumer;
    }
}
