package chessman;

public interface ManufactoryInterface {
    Chessman createSet(int chessmanAmount, String Board, String Instruction);

    void sellingSet(int setAmount);

    default void sellingSet(int setAmount, Buyer tom) {
    }
}
