package Problem1;

import sun.nio.cs.ext.MacHebrew;

public class Sphere implements ThreeDShapes{
    int radius;
    public Sphere(){}
    public Sphere(int radius1){
        radius = radius1;
    }
    public double Volume(){
        return 4/3 * Math.PI *  radius * radius * radius ;
    }
    public double SurfaceArea(){
        return 4 * Math.PI * radius * radius;
    }
}
