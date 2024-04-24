public class Vehicle {
    private String brand;
    private String model;
    private String fuelType;
    private int registrationNumber;
    private int firstRegistrationYearAndMonth;
    private int odometer;
    private boolean gear;
    private String seats;
    private boolean aircon;
    private boolean cruiseControl;
    private int horsePower;
    private boolean spoiler;
    private int ccm;
    private int trunkLiters;

    public Vehicle (String brand, String model, String fuelType, int registrationNumber,
                    int firstRegistrationYearAndMonth, int odometer, boolean gear, String seats,
                    boolean aircon, boolean cruiseControl, int horsePower, boolean spoiler, int ccm, int trunkLiters)   {
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
        this.spoiler = spoiler;
        this.ccm = ccm;
        this.trunkLiters = trunkLiters;

    }
    public Vehicle ()   {}
}


