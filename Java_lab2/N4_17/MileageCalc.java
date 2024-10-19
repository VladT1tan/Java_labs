package N4_17;

import java.util.Scanner;

public class MileageCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;
        double tripMilesPerGallon;
        int milesDriven;
        int gallonsUsed;

        System.out.println("Enter -1 for miles driven to stop input.");

        while (true) {
            System.out.print("Enter miles driven for this trip (or -1 to end): ");
            milesDriven = input.nextInt();

            if (milesDriven == -1) {
                break;
            }

            System.out.print("Enter gallons used for this trip: ");
            gallonsUsed = input.nextInt();

            tripMilesPerGallon = (double) milesDriven / gallonsUsed;
            System.out.printf("Miles per gallon for this trip: %.2f%n", tripMilesPerGallon);

            totalMiles += milesDriven;
            totalGallons += gallonsUsed;

            double overallMilesPerGallon = (double) totalMiles / totalGallons;
            System.out.printf("Overall miles per gallon: %.2f%n%n", overallMilesPerGallon);
        }

        System.out.println("Program ended.");
    }
}