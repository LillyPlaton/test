

import java.util.Scanner;

public class Main01 {
  // comentariu//

  public static double discriminant(double a, double b, double c) {
    return b * b - 4 * a * c;
  }

  public static void solveAndPrintRoots(double a, double b, double c) {
    double d = discriminant(a, b, c);
    double x1 = (-b + Math.sqrt(d)) / (2 * a);
    double x2 = (-b - Math.sqrt(d)) /(2 * a);
    System.out.println("x1 = " + x1 + ", x2 = " + x2);
    System.out.println("Число");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextByte();
    solveAndPrintRoots(a, b, c);
  }
}


