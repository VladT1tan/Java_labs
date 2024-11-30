package N8_6;

public class SavingsAccount {
    private static double annualInterestRate; // Годовая процентная ставка (общая для всех)
    private double savingsBalance;            // Баланс на счёте для каждого объекта

    public SavingsAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.savingsBalance = initialBalance;
    }

    // Метод для расчёта и добавления месячного процента к балансу
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    // Статический метод для изменения процентной ставки
    public static void modifyInterestRate(double newAnnualInterestRate) {
        if (newAnnualInterestRate < 0 || newAnnualInterestRate > 1) {
            throw new IllegalArgumentException("Interest rate must be between 0 and 1 (as a decimal).");
        }
        annualInterestRate = newAnnualInterestRate;
    }

    public static void main(String[] args) {
        // Начальная процентная ставка
        SavingsAccount.modifyInterestRate(0.04); // 4%

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        System.out.println("Balances after 12 months at 4% annual interest:");

        for (int month = 1; month <= 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.printf("Month %d:\n", month);
            System.out.printf("Saver 1: $%.2f\n", saver1.getSavingsBalance());
            System.out.printf("Saver 2: $%.2f\n", saver2.getSavingsBalance());
        }

        // Изменение процентной ставки
        SavingsAccount.modifyInterestRate(0.05); // 5%

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nBalances after 1 month at 5% annual interest:");
        System.out.printf("Saver 1: $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2: $%.2f\n", saver2.getSavingsBalance());
    }
}