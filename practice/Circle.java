package practice;

public class Circle {

    double radius;

    static final double pi = 3.14;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getCircle() {
        return pi * radius * radius;

    }

}
