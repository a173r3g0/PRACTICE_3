
package pract3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    
    Rectangle() {}
    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getLength() {
       return this.length;
    }
    
    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: Area - " + getArea() + ", perimetr - " + getPerimeter();
    }
    
}
