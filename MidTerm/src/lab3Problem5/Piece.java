package lab3Problem5;

import javafx.geometry.Pos;
import java.awt.*;

public abstract class Piece {
    private Point pos;
    public Piece () {

    }
    public Piece(Point _pos){
        pos = _pos ;
    }
    public abstract boolean isLegalMove(Point a , Point b);
}
