package BeeCrowd;

import java.util.Scanner;

//1005
public class Average1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gradeA = scanner.nextDouble();
        double gradeB = scanner.nextDouble();

        final double weightA = 3.5;
        final double weightB = 7.5;

        double average = (gradeA * weightA) + (gradeB * weightB);
        average = average / (weightA + weightB);
        System.out.printf("MEDIA = %.5f\n", average);

        scanner.close();
    }
}
