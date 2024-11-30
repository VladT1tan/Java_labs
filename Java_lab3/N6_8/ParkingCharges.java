package N6_8;
import java.util.Scanner;
//6.8
public class ParkingCharges {
    public static double calculateCharges(int hoursParked){
        double charge = 2.00;// минимальная плата за 3 часа

        if(hoursParked > 3){
            charge += 0.50;
        }
        // проверка максимальной платы
        if(charge > 10){
            charge = 10;
        }

        return charge;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;
        int customerCount = 1;

        while (true){
            System.out.print("Enter hours parked for " + customerCount + " customer (or -1 to end program):");
            int hoursParked = input.nextInt();

            if(hoursParked == -1){
                break;
            }
            // проверка на предел количества часов
            if(hoursParked < 1 || hoursParked > 24){
                System.out.println("Invalid input. Hours must be between 1 and 24!");
                continue;
            }
            // расчет стоимости для текущего клиента
            double charge = calculateCharges(hoursParked);
            totalReceipts += charge;

            // расходы каждого клиента
            System.out.printf("Charges for customer %d: %.2f%n", customerCount, charge);
            customerCount++;
        }
        // вывод общей суммы доходов
        System.out.printf("Total of yesterday’s receipts: %.2f%n", totalReceipts);
    }
}
