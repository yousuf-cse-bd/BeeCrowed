package BeeCrowd;


import java.util.Scanner;
//1017
public class FuelSpent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int averageSpeed = scanner.nextInt();

        double fuelSpent = calculateFuelSpent(hour, averageSpeed);
        System.out.printf("%.3f\n", fuelSpent);
        scanner.close();
    }

    public static double calculateFuelSpent(int hour, int averageSpeed){
        final int DISTANCE_PER_LITRES = 12;

        return (double) (hour * averageSpeed) / DISTANCE_PER_LITRES;
    }
}
