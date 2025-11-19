package pckg_sladoled;

public class ChocolateFlavoredIceCream extends AbsSladoled{

    protected ChocolateFlavoredIceCream(int amount, double price, VanillaFlavorIceCream vanillaFlavorIceCream) {
        super(amount, price);
    }

    @Override
    protected double calculateTotalPrice() {
        return amount*price;
    }

    @Override
    public String toString() {
        return "ChocolateFlavoredIceCream{" +
                "price=" + amount*price +
                '}';
    }
}
