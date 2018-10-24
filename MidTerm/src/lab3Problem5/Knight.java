package lab3Problem5;

import java.awt.*;

public class Knight extends Piece{
    public Knight() {
        super ();
    }
    public  Knight(Point pos){
        super(pos);
    }
    public boolean isLegalMove(Point a, Point b){
        double ax = a.getX();
        double bx = b.getX();
        double ay = a.getY();
        double by = b.getY();
        if(Math.abs(ax-bx) == 1 && Math.abs(ay - by)==2 ){
            return true;
        }
        if(Math.abs(ax-bx)== 2 && Math.abs(ay-by)==1){
            return true;
        }
        return  false;
    }
}
