package Problem3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        super();
    }
    public Rectangle(double _width, double _length){
        super();
        width = _width;
        length = _length;
    }
    public Rectangle(double _width, double _length, String _color, boolean _filled){
        super(_color,_filled);
        width = _width;
        length = _length;
    }
    public double getWidth(){
        return width;
    }
    public void  setWidth(double _width){
        width = _width;
    }
    public double getLength(){
        return length;
    }
    public void  setLength(double _length){
        length = _length;
    }
    public  double getArea(){
        return length * width;
    }
    public  double getPerimeter(){
        return 2 * ( length + width );
    }
    public String toString(){
        return "Length: " + length + " width: " + width + " Area: " + getArea() + " Perimeter: " + getPerimeter();
    }
    public boolean equals(Object o ){
        if(!(o instanceof Rectangle)) return  false;
        Rectangle rectangle = (Rectangle) o;
        return (rectangle.width == width) && (rectangle.length == length);
    }
}
