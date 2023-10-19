package Java;

import java.util.Scanner;

public class Rectangle {
    private double length, width;

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and Width must be positive numbers");
        }
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rect = new Rectangle(length, width);
        System.out.printf("The area is %.1f\n", rect.getArea());
        System.out.printf("The perimeter is %.1f\n", rect.getPerimeter());
        scanner.close();
    }
}
