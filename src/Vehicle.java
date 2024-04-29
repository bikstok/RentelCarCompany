public class Vehicle {
    private String brand;
    private String model;
    private String fuelType;
    private int registrationNumber;
    private int firstRegistrationYearAndMonth;
    private int odometer;
    private boolean gear;
    private int seats;
    private boolean aircon;
    private boolean cruiseControl;
    private int horsePower;
    private boolean spoiler;
    private int ccm;
    private int trunkLiters;

    public Vehicle (String brand, String model, String fuelType, int registrationNumber,
                    int firstRegistrationYearAndMonth, int odometer, boolean gear, int seats,
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

    public String getBrand()  { return brand; }

    public String getModel()  { return model; }

    public String getFuelType() { return fuelType; }

    public int getRegistrationNumber() { return registrationNumber; }

    public int getFirstRegistrationYearAndMonth() { return firstRegistrationYearAndMonth; }

    public int getOdometer() { return odometer; }

    public boolean isGear() { return gear; }

    public int getSeats() { return seats; }

    public boolean isAircon() { return aircon; }

    public boolean isCruiseControl() { return cruiseControl; }

    public int getHorsePower() { return horsePower; }

    public boolean isSpoiler() { return spoiler; }

    public int getCcm() { return ccm; }

    public int getTrunkLiters() { return trunkLiters; }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setFirstRegistrationYearAndMonth(int firstRegistrationYearAndMonth) {
        this.firstRegistrationYearAndMonth = firstRegistrationYearAndMonth;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void setGear(boolean gear) {
        this.gear = gear;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setAircon(boolean aircon) {
        this.aircon = aircon;
    }

    public void setCruiseControl(boolean cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }

    public void setCcm(int ccm) {
        this.ccm = ccm;
    }

    public void setTrunkLiters(int trunkLiters) {
        this.trunkLiters = trunkLiters;
    }
}

