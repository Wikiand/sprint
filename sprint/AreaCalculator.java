package sprint;

public class AreaCalculator {

    // Calculate area of a square
    public double calculateArea(double side) {
        double area = side * side;
        return Math.round(area * 100.0) / 100.0;
    }

    // Calculate area of a rectangle
    public double calculateArea(double length, double width) {
        double area = length * width;
        return Math.round(area * 100.0) / 100.0;
    }

    // Calculate area of a circle (only if flag is true)
    public double calculateArea(double radius, boolean proceed) {
        if (!proceed) {
            return Double.NaN;
        }
        double area = Math.PI * radius * radius;
        return Math.round(area * 100.0) / 100.0;
    }
}

