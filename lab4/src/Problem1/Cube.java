package Problem1;

public class Cube implements ThreeDShapes {
    int a;
    public Cube(){}
    public Cube(int radius1){
        a = radius1;
    }
    public double Volume(){
        return a * a * a;
    }
    public double SurfaceArea(){
        return 6 * a * a ;
    }
}
