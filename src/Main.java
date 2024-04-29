import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static ArrayList<Vehicle> cars = new ArrayList<Vehicle>();

    public static ArrayList<Rental> customers = new ArrayList<Rental>();

    public static ArrayList<CurrentRentedCars> rentedCars = new ArrayList<CurrentRentedCars>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to Honolulu Car Rental System");
            System.out.println("1. Create Car");
            System.out.println("2. Create Customer");
            System.out.println("3. Create Rental");
            System.out.println("4. Print Cars List");
            System.out.println("5. Print Customers List");
            System.out.println("6. Print Rentals List");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();



            switch (choice) {
                case 1:
                    createCar(scan); // Call createCar method from main object
                    break;
                case 2:
                    createCustomer(scan);
                    break;
                case 3:
                    //createRental(scan);
                    break;
                case 4:
                    //printCarsList();
                    break;
                case 5:
                    //printCustomersList();
                    break;
                case 6:
                    //printRentalsList();
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        }
    }
    public static void createCar(Scanner scan) {
        Vehicle car1 = new Vehicle("Volvo", "S60", "Petrol", 3045, 2020/10, 22000,
                true , 5, true, true, 250, false, 2000, 450);
        cars.add(car1);

        Vehicle car2 = new Vehicle("Bolvo", "S60", "Petrol", 3045, 2020/10, 22000,
                true , 5, true, true, 250, false, 2000, 450);
        cars.add(car2);

        for (Vehicle car : cars) {
            System.out.println(car.getBrand());

        }
    }

    public static void createCustomer(Scanner scan) {
        Rental customer1 = new Rental("Lars Jensen", "23 Havnegade", "Copenhagen", "lars.jensen@example.com", 45-12345678, 1000);
        customers.add(customer1);

        for (Rental customer : customers) {
            System.out.println(customer.getDriverName());
        }
    }

    public static void createRental (Scanner scan) {
        int carIndex = 0;
        int customerIndex = 1;

        Vehicle rentedCar = cars.get(carIndex);
        Rental rentingCustomer = customers.get(customerIndex);

        CurrentRentedCars rentedContracts = new CurrentRentedCars(rentedCar, rentingCustomer);
        rentedContracts.add(rentedCar);

    }

    public static void printCarsList ()  throws FileNotFoundException {
        Scanner outPrintCars = new Scanner(new File("src/Cars"));

        while (outPrintCars.hasNextLine()) {
            String line = outPrintCars.nextLine();
            Scanner scanLine = new Scanner(line);
            String brand = scanLine.next();
            String model = scanLine.next();
            String fuelType = scanLine.next();
            int regNumber = scanLine.nextInt();
            String yAndM = scanLine.next();
            int odometer = scanLine.nextInt();
            String gear = scanLine.next();
            int seats = scanLine.nextInt();
            String aircon = scanLine.next();
            String cruise = scanLine.next();
            int horsePower = scanLine.nextInt();
            String spoiler = scanLine.next();
            int ccm = scanLine.nextInt();
            int trunk = scanLine.nextInt();
            System.out.println();
            System.out.printf("""
                        Brand:                            %s
                        Model:                            %s
                        Fuel type:                        %s
                        Registration number:              %d
                        Year/Month of first registration: %s
                        Odometer:                         %d
                        M / A gear:                       %s
                        Number of seats:                  %d
                        Aircon:                           %s
                        Cruise control:                   %s
                        Horsepower:                       %d
                        Spoiler:                          %s
                        Ccm:                              %d
                        Trunk:                            %d liters\n""",
                    brand, model, fuelType, regNumber, yAndM, odometer, gear,
                    seats, aircon, cruise, horsePower, spoiler, ccm, trunk);

            System.out.println();
        }

    }
}