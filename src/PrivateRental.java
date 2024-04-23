public class PrivateRental extends Rental{
    int driverLicenceNumber;
    int driverLicenceDate;

    public PrivateRental (String driverName, String driverAddress, String driverCityName, String driverEmail,
                   int driverPhoneNumber, int driverPostNumber, int driverLicenceNumber, int driverLicenceDate) {

        super(driverName, driverAddress, driverCityName, driverEmail, driverPhoneNumber, driverPostNumber);
        this.driverLicenceNumber = driverLicenceNumber;
        this.driverLicenceDate = driverLicenceDate;
    }

    public PrivateRental() {

    }



}
