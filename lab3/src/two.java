abstract class ThreeDeeFigure {
    private double volume;
    private double surfaceArea;
    ThreeDeeFigure(){}
    ThreeDeeFigure(double volume,double surfaceArea){
        this.volume = volume;
        this.surfaceArea = surfaceArea;
    }
    public void setVolume(double volume){
        this.volume = volume;
    }
    public void setSurfaceArea(double surfaceArea){
        this.surfaceArea = surfaceArea;
    }
    public double getVolume(){
        return volume;
    }
    public double getSurfaceArea(){
        return surfaceArea;
    }
    public abstract double Volume();
    public abstract double SurfaceArea();
}

class Cylinder extends ThreeDeeFigure{
    private int radius = 1;
    private int height = 1;
    public Cylinder(int Height, int Radius){
        height = Height;
        radius = Radius;
    }
    public double SurfaceArea() {
        double d = height* Math.PI *2 * radius + 2 * Math.PI * radius * radius;
        super.setSurfaceArea(d);
        return d;
    }
    public double Volume(){
        double base = Math.PI * Math.pow(radius,2);
        double d = base * height;
        super.setVolume(d);
        return d;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int NewHeight){
        height = NewHeight;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int newRadius){
        radius = newRadius;
    }
}


class Sphere extends ThreeDeeFigure{
    private int radius = 1;
    public Sphere(int radius){
        this.radius = radius;
    }
    public double SurfaceArea(){
        double d = Math.PI* 4 * radius * radius;
        super.setSurfaceArea(d);
        return d;
    }
    public double Volume(){
        double d = 4/3 * Math.PI * radius *radius *radius;
        super.setVolume(d);
        return  d;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
}

class Cube extends ThreeDeeFigure{
    private int length = 1;
    Cube(int length){
        this.length = length;
    }
    public double Volume(){
        double d = length* length * length;
        super.setVolume(d);
        return d;
    }
    public double SurfaceArea(){
        double d= 6 * length * length;
        super.setSurfaceArea(d);
        return d;
    }
    public  int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
}

public class two{
    public static void main(String [] args){
        Cylinder cylinder = new Cylinder(5,6);
        System.out.println(cylinder.SurfaceArea());
    }
}