package Problem1;

public class Cylinder implements ThreeDShapes {
    private int height,radius;
    public Cylinder(){ }
    public Cylinder(int h , int r){
        height = h ;
        radius = r ;
    }
    public double Volume(){
        return Math.PI * radius * radius * height;
    }
    public double SurfaceArea(){
        return 2 * Math.PI * radius*radius + Math.PI * 2 * radius * height;
    }
}
