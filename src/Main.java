import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallonsInTank, fuelEfficiency, pricePerGallon;


        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
            }
            gallonsInTank = scanner.nextDouble();
        } while (gallonsInTank <= 0);  //


        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
            }
            fuelEfficiency = scanner.nextDouble();
        } while (fuelEfficiency <= 0);


        do {
            System.out.print("Enter the price of gas per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
            }
            pricePerGallon = scanner.nextDouble();
        } while (pricePerGallon <= 0);


        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;


        double maxDistance = gallonsInTank * fuelEfficiency;


        System.out.println("\n=== Fuel Cost Calculations ===");
        System.out.printf("Cost to drive 100 miles: $%.2f%n", costPer100Miles);
        System.out.printf("Maximum distance with a full tank: %.2f miles%n", maxDistance);
    }
}
