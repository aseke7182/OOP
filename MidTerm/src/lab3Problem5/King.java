package lab3Problem5;

import java.awt.*;

public class King extends Piece {
    public King(Point pos){
        super(pos);
    }
    public boolean isLegalMove(Point a , Point b){
        double ax = a.getX();
        double bx = b.getX();
        double ay = a.getY();
        double by = b.getY();
        return (Math.abs(ax - bx) <= 1 && Math.abs(ay-by) <= 1);
    }

}
