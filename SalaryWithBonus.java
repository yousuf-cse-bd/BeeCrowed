package BeeCrowd;

import java.util.Scanner;
/// 1009
public class SalaryWithBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double BONUS_RATE = 0.15;
        String employeeName = scanner.next();
        double salary = scanner.nextDouble();
        double soldPrice = scanner.nextDouble();

        double salaryWithBonus = salary + (soldPrice * BONUS_RATE);
        System.out.printf("TOTAL = R$ %.2f\n", salaryWithBonus);

        scanner.close();
    }
}
