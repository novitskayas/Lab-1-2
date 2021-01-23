package chessman;

import java.awt.*;

public class Chessman {
    private Color color;
    private int number;
    public enum chessmanType {
        king,
        queen,
        rooks,
        bishop,
        knights,
        pawns;
    }

    public Chessman(Color color, final int number) {
        this.color = color;
        this.number = number;
    }

}
