package pckg_sladoled;

public class BlackChocoTopping extends IceCreamDecorator{
    protected BlackChocoTopping(int amount, double price, AbsSladoled sladoled) {
        super(price, sladoled);
    }

    @Override
    protected double calculateTotalPrice() {
        double totalPrice = sladoled.calculateTotalPrice() + price * amount;
        return sladoled.calculateTotalPrice() + amount * price;
    }

    @Override
    public String toString() {
        return "BlackChocoTopping{" +
                "sladoled=" + sladoled +
                ", price=" + sladoled.calculateTotalPrice() + price*amount +
                '}';
    }
}
