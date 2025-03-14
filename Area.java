package BeeCrowd;

import java.util.Scanner;

/// 1012
public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println("TRIANGULO: "+String.format("%.3f", areaOfTriangle(a, c)));
        System.out.println("CIRCULO: "+String.format("%.3f", areaOfCircle(c)));
        System.out.println("TRAPEZIO: "+String.format("%.3f", areaOfTrapezium(a, b, c)));
        System.out.println("QUADRADO: "+String.format("%.3f", areaOfSquare(b)));
        System.out.println("RETANGULO: "+String.format("%.3f", areaOfRectangle(a, b)));
        scanner.close();
    }

    public static double areaOfTriangle(double base, double height){
        return 0.5 * base * height;
    }
    public static double areaOfCircle(double radius){
        final double PI = 3.14159;
        return PI * Math.pow(radius, 2);
    }
    public static double areaOfTrapezium(double a, double b, double h){
        return (a + b) * 0.5 * h;
    }
    public static double areaOfSquare(double side){
        return Math.pow(side, 2);
    }
    public static double areaOfRectangle(double base, double height){
        return base * height;
    }
}
