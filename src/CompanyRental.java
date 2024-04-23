public class CompanyRental extends Rental {
    String companyName;
    String companyAddress;
    int companyPhoneNumber;
    int companyCRN;

    public CompanyRental (String driverName, String driverAddress, String driverCityName, String driverEmail, int driverPhoneNumber,
                          int driverPostNumber, String companyName, String companyAddress, int companyPhoneNumber, int companyCRN) {

        super(driverName, driverAddress, driverCityName, driverEmail, driverPhoneNumber, driverPostNumber);
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyPhoneNumber = companyPhoneNumber;
        this.companyCRN = companyCRN;
    }

    public CompanyRental () {

    }

}
