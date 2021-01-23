package chessman;

public class Board implements BoardInterface {
    public static final int Board_Size = 8;

    @Override
    public void displayChessBoard() {
        for (int row = 0; row < Board_Size; row++) {
            System.out.println("");
            System.out.println("---------------------------------");

            for (int column = 0; column < Board_Size; column++) {
                System.out.print("| " + " " + " ");
            }
        }
        System.out.println("");
        System.out.println("---------------------------------");
    }

}
