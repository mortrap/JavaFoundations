package core;

public class Circle extends Figure {
   static final double PI = 3.14;
    private double radius;
    private double line;

    public Circle(int countPoint, double PI, double radius) {
        super(countPoint);
        this.radius = radius;
        this.line = line;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLine() {
        return line;
    }

    public void setLine(double line) {
        this.line = lineInteger(PI, radius);
    }


    public double lineInteger(double PI, double radius) {
        double circleLength = 2 * PI * radius;
        System.out.println("Circles length is: " + circleLength);
        return circleLength;
    }
}
