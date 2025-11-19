package pckg_sladoled;

public class VanillaFlavorIceCream extends AbsSladoled{
    protected VanillaFlavorIceCream(int amount, double price) {
        super(amount, price);
    }

    @Override
    protected double calculateTotalPrice() {
        return amount*price;
    }

    @Override
    public String toString() {
        return "VanillaFlavorIceCream{" +
                "price=" + amount*price +
                '}';
    }
}
