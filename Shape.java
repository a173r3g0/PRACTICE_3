
package pract3;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    
    Shape() {}
    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public boolean isFilled() {
        return this.filled;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
    @Override
    public abstract String toString();
}
