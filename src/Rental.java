public class Rental {
    String driverName;
    String driverAddress;
    String driverCityName;
    String driverEmail;
    int driverPhoneNumber;
    int driverPostNumber;

    public Rental (String driverName, String driverAddress, String driverCityName,
                   String driverEmail, int driverPhoneNumber, int driverPostNumber) {

            this.driverName = driverName;
            this.driverAddress = driverAddress;
            this.driverCityName = driverCityName;
            this.driverEmail = driverEmail;
            this.driverPhoneNumber = driverPhoneNumber;
            this.driverPostNumber = driverPostNumber;
    }

    public Rental () {
    }
}
