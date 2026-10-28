/*Aim: WAP to create a program demonstrating hierarchical inheritance using a base class shape and derived classes Rectangle and Circle.
       Calculate the area of each shape amd use exception handling to display an appropriate message if user enters negative dimensions or invalid input.*/


import java.util.Scanner;

class Shape {
    double area;
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        area = 3.14 * radius * radius;
        System.out.printf("Area of Circle: %.2f%n", area);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter length of Rectangle: ");
            double length = sc.nextDouble();

            System.out.print("Enter breadth of Rectangle: ");
            double breadth = sc.nextDouble();

            System.out.print("Enter radius of Circle: ");
            double radius = sc.nextDouble();

            if (length < 0 || breadth < 0 || radius < 0) {
                throw new IllegalArgumentException(
                    "Dimensions cannot be negative!"
                );
            }

            Rectangle r = new Rectangle(length, breadth);
            Circle c = new Circle(radius);

            r.calculateArea();
            c.calculateArea();

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
