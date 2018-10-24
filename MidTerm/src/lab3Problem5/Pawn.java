package lab3Problem5;

import java.awt.*;

public class Pawn extends Piece{
    public Pawn(Point pos){
        super(pos);
    }
    public boolean isLegalMove(Point a , Point b){
        double ax = a.getX();
        double bx = b.getX();
        double ay = a.getY();
        double by = b.getY();
        return (Math.abs(bx - ax) <= 1 && by-ay ==1 || ax == bx && by - ay==2);
    }
}
