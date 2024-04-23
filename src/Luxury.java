public class Luxury extends Vehicle {

    int ccm;

    public Luxury (String brand, String model, String fuelType, int registrationNumber,
                   int firstRegistrationYearAndMonth, int odometer, int ccm,  boolean gear,
                   boolean aircon, boolean cruiseControl, String seats, int horsePower)    {

        super(brand, model, fuelType, registrationNumber,
        firstRegistrationYearAndMonth, odometer, gear, seats, aircon, cruiseControl, horsePower);

        this.ccm = ccm;
    }
}
