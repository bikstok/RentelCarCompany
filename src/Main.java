import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
    ArrayList<Rental> customers = new ArrayList<Rental>();

    public static void main(String[] args) {
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
                    //createCustomer(scan);
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
    public void createCar(Scanner scan) {
    }
}