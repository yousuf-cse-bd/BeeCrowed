package BeeCrowd;

import java.util.Scanner;
/// 1015
public class DistanceTwoPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.printf("%.4f\n", distanceBetweenTwoPoints(x1, y1, x2, y2));
        scanner.close();
    }
    public static double distanceBetweenTwoPoints(double x1, double y1, double x2, double y2){
        double d1 = Math.pow((x2 - x1), 2);
        double d2 = Math.pow((y2 - y1), 2);
        double distance = d1 + d2;
        return Math.sqrt(distance);
    }
}
