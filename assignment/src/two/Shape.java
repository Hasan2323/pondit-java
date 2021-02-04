package two;

abstract public class Shape {

   abstract public double getArea();
   abstract public double getPerimeter();
}

class Rectangle extends Shape {

    private double width, height;

    public Rectangle() {
        this(1,1); // default
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }
}

class Circle extends Shape {

    final double PI = Math.PI;
    private double radius;

    public Circle() {
        this(1); // default
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (PI * Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}

class Main {
    public static void main(String[] args) {

        // Rectangle
        double width = 5;
        double length = 6;

        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width = " + width
            + "\nRectangle length = " + length
            + "\nRectangle Area = " + rectangle.getArea()
            + "\nRectangle Perimeter = " + rectangle.getPerimeter() + "\n");

        // Circle
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius = " + radius
            + "\nCircle area = " + circle.getArea()
            + "\nCircle perimeter = " + circle.getPerimeter());

    }
}
