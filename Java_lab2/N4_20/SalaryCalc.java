package N4_20;

import java.util.Scanner;

public class SalaryCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUM_EMPLOYEES = 3;
        final int REGULAR_HOURS = 40;
        final double OVERTIME_RATE = 1.5;

        for (int i = 1; i <= NUM_EMPLOYEES; i++) {
            System.out.printf("Enter hours worked for employee %d: ", i);
            int hoursWorked = input.nextInt();

            System.out.printf("Enter hourly rate for employee %d: ", i);
            double hourlyRate = input.nextDouble();

            double grossPay;

            if (hoursWorked <= REGULAR_HOURS) {
                grossPay = hoursWorked * hourlyRate;
            } else {
                int overtimeHours = hoursWorked - REGULAR_HOURS;
                grossPay = (REGULAR_HOURS * hourlyRate) + (overtimeHours * hourlyRate * OVERTIME_RATE);
            }

            System.out.printf("Gross pay for employee %d: $%.2f%n%n", i, grossPay);
        }
    }
}