package chessman;

public class Manufactory implements ManufactoryInterface {

    @Override
    public Chessman createSet(int chessmanAmount, String Board, String Instruction) {
        return null;
    }

    @Override
    public void sellingSet(int setAmount) {
    }

    @Override
    public void sellingSet(int setAmount, Buyer tom) {

    }

    public Manufactory() {
        System.out.println("Сборка прошла успешно");
    }
}
