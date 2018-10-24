package Problem3;

public class Circle extends Shape {
    protected double radius;
    public Circle(double _radius){
        super();
        radius = _radius;
    }
    public Circle(double _radius, String _color, boolean _filled){
        super(_color,_filled);
        radius = _radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double _radius){
        radius = _radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2* Math.PI * radius;
    }
    public String toString(){
        return "radius: " + radius + " color: " + color + " Area: " + getArea() + " Perimeter: " + getPerimeter();
    }
    public boolean equals(Object o){
        if(!(o instanceof Circle)) return  false;
        Circle c = (Circle)o;
        return radius == c.radius;
    }
}
