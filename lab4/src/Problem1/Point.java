package Problem1;

public class Point implements ThreeDShapes {
    private int x,y;
    public Point(){}
    public Point(int x1,int y1){
        x = x1;
        y =y1;
    }
    public double Volume(){
        return 1;
    }
    public double SurfaceArea(){
        return 1;
    }
}