package BeeCrowd;

import java.util.Scanner;

//1002

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();
        final double PI = 3.14159;
        double area = PI * Math.pow(radius, 2);
        System.out.printf("A=%.4f\n", area);

        scanner.close();
    }
}
