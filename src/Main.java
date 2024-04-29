import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
public class Main {
    public static ArrayList<Vehicle> cars = new ArrayList<Vehicle>();

    public static ArrayList<Rental> customers = new ArrayList<Rental>();

    public static ArrayList<String> rentedCars = new ArrayList<String>();

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
    public static void createCar(Scanner scan) throws FileNotFoundException {


        try {
            FileWriter writeToFile = new FileWriter("src/Cars");


        StringBuilder buildString = new StringBuilder();
            String dqwdw = "du dum";
            writeToFile.write(dqwdw);

        /*System.out.println("Enter brand");
        String brand = scan.next();
        System.out.println("Enter model");
        String model = scan.next();
        System.out.println("Enter fuel type (Petrol / Diesel)");
        String fueltype = scan.next();
        System.out.println("Enter registration number (example: 1234)");
        int regNumber = scan.nextInt();
        System.out.println("Enter the year and month of the first registration (xxxx/xx)");
        String yAndM = scan.next();
        System.out.println("Enter amount of driven km");
        int odometer = scan.nextInt();
        System.out.println("Is the car automatic? (Y/N))");
        String gearAnswer = scan.next();
        boolean gear;

        if(gearAnswer.equalsIgnoreCase("Y"))    {
            gear = true;
        }else   {
            gear = false;
        }
    }

    public static void createCustomer(Scanner scan) {
        Rental customer1 = new Rental("Lars Jensen", "23 Havnegade", "Copenhagen", "lars.jensen@example.com", 45-12345678, 1000);
        customers.add(customer1);

        Rental customer2 = new Rental("Vens Jensen", "23 Havnegade", "Copenhagen", "lars.jensen@example.com", 45-12345678, 1000);
        customers.add(customer2);

        Rental customer3 = new Rental("Gens Jensen", "23 Havnegade", "Copenhagen", "lars.jensen@example.com", 45-12345678, 1000);
        customers.add(customer3);

        for (Rental customer : customers) {
            System.out.println(customer.getDriverName());
        }
    }

    /*public void rentCar(Vehicle vehicle, Rental customer) {
        // Check if the vehicle is available for rent
        if (!rentedCars.contains(vehicle.getRegistrationNumber())) {
            // Update vehicle state
            rentedCars.add(vehicle.getRegistrationNumber());

            // Update customer state
            customer.setRentedCar(vehicle);

            // Additional rental actions (e.g., record transaction, update statistics, etc.)
            System.out.println("Car rented successfully.");
        } else {
            System.out.println("Sorry, the car is already rented.");
        } */

    public static void printCarsList ()  throws FileNotFoundException{
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
            boolean gearBool = scanLine.nextBoolean(); //bool
            String gear = "";

            if(gearBool)    {
                gear = "Automatic";
            }else {
                gear = "Manuel";
            }

            int seats = scanLine.nextInt();
            boolean airconBool = scanLine.nextBoolean(); //bool
            String aircon = "";

            if(airconBool)    {
                aircon = "Yes";
            }else {
                aircon = "No";
            }

            boolean cruiseBool = scanLine.nextBoolean(); //bool
            String cruise = "";

            if(cruiseBool)    {
                cruise = "Yes";
            }else {
                cruise = "No";
            }

            int horsePower = scanLine.nextInt();
            boolean spoilerBool = scanLine.nextBoolean(); //bool
            String spoiler = "";

            if(spoilerBool)    {
                spoiler = "Yes";
            }else {
                spoiler = "No";
            }

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