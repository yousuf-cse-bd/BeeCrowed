package BeeCrowd;

import java.util.Scanner;

///1007

public class Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        d = (a * b) - (c * d);
        System.out.println("DIFERENCA = "+d);

        scanner.close();
    }
}
