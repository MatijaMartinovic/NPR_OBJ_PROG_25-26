package pckg_sladoled;

public class WallnutPowder extends IceCreamDecorator{
    private double totalPrice;

    protected WallnutPowder(int amount, double price, AbsSladoled sladoled) {
        super(price, sladoled);
    }

    @Override
    protected double calculateTotalPrice() {
        totalPrice = sladoled.calculateTotalPrice() + amount*price;
        return totalPrice;
    }

    @Override
    public String toString() {
        return "WallnutPowder{" +
                "totalPrice=" + totalPrice +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
