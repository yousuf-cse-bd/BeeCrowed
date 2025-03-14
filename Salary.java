package BeeCrowd;

import java.util.Scanner;

/// 1008

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeNumber = scanner.nextInt();
        int hour = scanner.nextInt();
        double salaryPerHour = scanner.nextDouble();

        double totalSalary = hour * salaryPerHour;

        System.out.println("NUMBER = "+employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", totalSalary);

        scanner.close();
    }
}
