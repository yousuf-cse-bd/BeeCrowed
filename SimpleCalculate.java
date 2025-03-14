package BeeCrowd;

import java.util.Scanner;

/// 1010

public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfUnit1 = scanner.nextInt();
        int unitOfProduct1 = scanner.nextInt();
        float productPrice1 = scanner.nextFloat();

        int numberOfUnit2 = scanner.nextInt();
        int unitOfProduct2 = scanner.nextInt();
        float productPrice2 = scanner.nextFloat();

        float payAblePrice = (unitOfProduct1 * productPrice1) + (unitOfProduct2 * productPrice2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", payAblePrice);
        scanner.close();
    }
}
