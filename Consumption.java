package BeeCrowd;

import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        double totalFuel = scanner.nextDouble();

        System.out.println(String.format("%.3f", calculateConsumption(distance, totalFuel))+ " km/l");
        scanner.close();
    }
    public static double calculateConsumption(int distance, double totalFuel){
        return distance / totalFuel;
    }
}
