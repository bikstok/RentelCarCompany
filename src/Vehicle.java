public class Vehicle {
    String brand;
    String model;
    String fuelType;
    int registrationNumber;
    int firstRegistrationYearAndMonth;
    int odometer;
    boolean gear;
    String seats;
    boolean aircon;
    boolean cruiseControl;
    int horsePower;

    public Vehicle (String brand, String model, String fuelType, int registrationNumber,
                    int firstRegistrationYearAndMonth, int odometer, boolean gear, String seats,
                    boolean aircon, boolean cruiseControl, int horsePower)   {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.registrationNumber = registrationNumber;
        this. firstRegistrationYearAndMonth = firstRegistrationYearAndMonth;
        this.odometer = odometer;
        this.gear = gear;
        this.seats = seats;
        this.aircon = aircon;
        this.cruiseControl = cruiseControl;
        this.horsePower = horsePower;

    }
    public Vehicle ()   {}
}
