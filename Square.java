
package pract3;

public class Square extends Rectangle{
    private double side;
    
    Square() {}
    Square(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
    }
    Square(double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        
        this.side = side;
        this.width = side;
        this.length = side;
    }
    
    public void setSide(double side) {
        this.side = side;
        setWidth(side);
        setLength(side);
    }
    
    public double getSide() {
        return this.side;
    }
    
    @Override
    public void setWidth(double side) {
        this.width = side;
    }
    
    @Override
    public void setLength(double side) {
        this.length = side;
    }
    
    @Override
    public String toString() {
        return "Square: Area - " + getArea() + ", perimeter - " + getPerimeter();
    }

}