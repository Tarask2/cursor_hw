package hw3;

import java.util.Scanner;

public class Circle {

    private double radius;
    Scanner scanner = new Scanner(System.in);

    public double area() {
        System.out.println("Enter the radius of the circle");
        radius = scanner.nextDouble();
        double result = Math.PI * radius * radius;
        return result;
    }
}
