package BeeCrowd;

//1006
import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int weightA = 2;
        final int weightB = 3;
        final int weightC = 5;

        double gradeA = scanner.nextDouble();
        double gradeB = scanner.nextDouble();
        double gradeC = scanner.nextDouble();

        double average = (gradeA * weightA) + (gradeB * weightB) + (gradeC * weightC);
        average /= (weightA + weightB + weightC);
        System.out.printf("MEDIA = %.1f\n", average);

        scanner.close();
    }
}
