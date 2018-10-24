package Problem3;

public abstract class Shape {
    protected  String color;
    protected  boolean filled;
    public Shape(){}
    public Shape(String _color , boolean _filled){
        color = _color;
        filled = _filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String _color){
        color = _color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean _filled){
        filled = _filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
