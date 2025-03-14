package BeeCrowd;

import java.util.Scanner;

/// 1013
public class TheGreatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println(theGreatest(number1, number2, number3)+" eh o maior");
        scanner.close();
    }
    public static int theGreatest(int number1, int number2, int number3){
        return Math.max(number1, Math.max(number2, number3));
    }
}
