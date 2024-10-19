package N3_11;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        ShowBalance(account1);
        ShowBalance(account2);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdding $%.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        ShowBalance(account1);
        ShowBalance(account2);

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nAdding $%.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        ShowBalance(account1);
        ShowBalance(account2);

        System.out.print("Enter withdraw amount for account1: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%nWithdraw $%.2f from account1 balance%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        ShowBalance(account1);
        ShowBalance(account2);

        System.out.print("Enter withdraw amount for account2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%nWithdraw $%.2f from account2 balance%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount);

        ShowBalance(account1);
        ShowBalance(account2);
    }
    public static void ShowBalance(Account account){
        System.out.printf("%s balance: $%.2f%n", account.getName(), account.getBalance());
    }
}
