package BeeCrowd;

//1004

import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int product = number1 * number2;
        System.out.println("PROD = "+product);
        scanner.close();
    }
}
