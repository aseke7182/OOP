package Problem4;

public class King implements Moveable {
    private int x ;
    private int y ;
    public boolean byY(int y1){
        if(y + 1 == y1 || y-1 == y1 || y == y1) return true;
        return false;
    }
    public boolean byX(int x1){
        if(x+1 == x1 || x -1 == x1 || x == x-1) return true;
        return false;
    }
}
