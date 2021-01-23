package chessman;

public interface BuyerInterface {
    static String getName() {
        return Buyer.name;
    }

    static int getPhone() {
        return Buyer.phone;
    }

    static int getIdOrder() {
        return Buyer.idOrder;
    }

    static String getAddress() {
        return Buyer.address;
    }
}
