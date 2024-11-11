package OOP;

import java.util.Scanner;
public class ShapeDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for Circle
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        // Get input for Rectangle
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);

        // Get input for Triangle
        double base = scanner.nextDouble();
        height = scanner.nextDouble();  // Reusing the variable for convenience
        Triangle triangle = new Triangle(base, height);

        // Create an array of Shape objects
        Shape[] shapes = new Shape[]{circle, rectangle, triangle};

        // Iterate over the array and describe each shape
        for (Shape shape : shapes) {
            shape.describe();
        }
    }
}

abstract class Shape {
    
    public abstract double calculateArea();

    public void describe() {
        System.out.println("Shape: " + this.getClass().getSimpleName() + ", Area: " + calculateArea());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}


class Triangle extends Shape {
    private double base;
    private double height;

    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
