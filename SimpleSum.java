package BeeCrowd;

import java.util.Scanner;

//1003

public class SimpleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int sum = number1 + number2;

        System.out.println("SOMA = "+sum);

        scanner.close();
    }
}
