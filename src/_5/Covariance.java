package _5;

import java.util.Arrays;
import java.util.List;

interface Shape {
  double area();
}

class Parent{}

class Son extends Parent{}

// List<Son> не наследник List<Parent>
public class Covariance {
  public static void main(String[] args) {
    List<Circle> circles = Arrays.asList(new Circle(1.0), new Circle(2.0));
    double circleArea = totalArea(circles);
    System.out.println(circleArea);

    List<Rectangle> rectangles = Arrays.asList(new Rectangle(2.0, 3.0), new Rectangle(4.0, 5.0));
    double rectangleArea = totalArea(rectangles);
    System.out.println(rectangleArea);
  }

  public static double totalArea(List<? extends Shape> shapes) {
    double sum = 0.0;
    for (Shape shape : shapes) {
      sum += shape.area();
    }
    return sum;
  }
}

class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override public double area() {
    return 3.14 * radius * radius;
  }
}

class Rectangle implements Shape {
  private double a;
  private double b;

  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  @Override public double area() {
    return a * b;
  }
}
