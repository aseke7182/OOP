package lab3Problem5;

import javax.swing.text.Position;
import java.awt.*;

public class Rock extends Piece {
    public Rock(Point pos){
        super(pos);
    }
    @Override
    public boolean isLegalMove(Point a, Point b){
        double ax = a.getX();
        double ay = a.getY();
        double bx = b.getX();
        double by = b.getY();
        return (ax==bx || ay ==by);
    }
}
