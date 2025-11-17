// Base class
class Shape {
    double getArea() {
        return 0;
    }
}

// Circle subclass
class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Square subclass
class Square extends Shape {
    int length;

    Square(int length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return length * length;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

public class Assignment2 {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        Square s = new Square(4);
        Rectangle r = new Rectangle(3, 6);

        System.out.println("Area of Circle = " + c.getArea());
        System.out.println("Area of Square = " + s.getArea());
        System.out.println("Area of Rectangle = " + r.getArea());
    }
}