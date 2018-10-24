package lab3Problem5;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        Point pos = new Point( 1, 1 );
        Point pos2 = new Point(2 ,2 );
        Knight pawn = new Knight();
        System.out.println(pawn.isLegalMove(pos,pos2));
    }
}
