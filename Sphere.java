package BeeCrowd;

import java.util.Scanner;
/// 1011
public class Sphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int radius = scanner.nextInt();

        double volume =  ((4.0 /3.0) * 3.14159 * radius * radius * radius);
        System.out.println("VOLUME = "+String.format("%.3f", volume));

        scanner.close();
    }
}
