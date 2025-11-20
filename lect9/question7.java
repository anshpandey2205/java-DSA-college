// Create a class that has overloaded methods 
// for displaying the area of different shapes.

package lect9;

class ShapeArea {
    // Method to calculate area of a rectangle
    public double area(double length, double width) {
        return length * width;
    }

    // Method to calculate area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a triangle
    public double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}
public class question7 {
    public static void main(String[] args) {
        ShapeArea shapeArea = new ShapeArea();

        double rectangleArea = shapeArea.area(5.0, 3.0);
        System.out.println("Area of Rectangle: " + rectangleArea);

        double circleArea = shapeArea.area(4.0);
        System.out.println("Area of Circle: " + circleArea);

        double triangleArea = shapeArea.area(6.0, 4.0, true);
        System.out.println("Area of Triangle: " + triangleArea);
        
    }
}

