package N3_13;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe", 3000);
        Employee emp2 = new Employee("Jane", "Smith", 4000);

        System.out.println("Employee 1 Yearly Salary: $" + emp1.getYearlySalary());
        System.out.println("Employee 2 Yearly Salary: $" + emp2.getYearlySalary());

        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("\nAfter 10% Raise:");
        System.out.println("Employee 1 Yearly Salary: $" + emp1.getYearlySalary());
        System.out.println("Employee 2 Yearly Salary: $" + emp2.getYearlySalary());
    }
}