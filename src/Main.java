import chessman.*;

public class Main {

    public static void main(String[] args){
        ManufactoryInterface sellChess = new Manufactory();
            sellChess.createSet(32, "8х8, красное дерево", "includes");
            sellChess.sellingSet(1, new Buyer("Tom", 567, 000123, "prosp. Kurbasa"));

        Buyer vasiliy = new Buyer("Vasiliy", 245, 004567, "ul. Malinovskaya");
        String vasiliyName = BuyerInterface.getName();
        int vasiliyPhone = BuyerInterface.getPhone();
        int vasiliyIdOrder = BuyerInterface.getIdOrder();
        String vasiliyAddress = BuyerInterface.getAddress();

        System.out.println("Покупатель: " + vasiliyName);
        System.out.println("Номер телефона: " + vasiliyPhone);
        System.out.println("Номер заказа: " + vasiliyIdOrder);
        System.out.println("Адресс: " + vasiliyAddress);
    }
}
