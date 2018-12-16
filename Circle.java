
package pract3;

public class Circle extends Shape {
    protected double radius;
    Circle() {}
    Circle(double radius) {
        this.radius = radius;
    }
    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    
    public void setRadius(double r) {
        radius = r;
    }
    
    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 3.14f * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14f * radius;
    }

    @Override
    public String toString() {
        return "Circle: Area - " + getArea() + ", perimetr - " + getPerimeter();
    }
    
    
}
