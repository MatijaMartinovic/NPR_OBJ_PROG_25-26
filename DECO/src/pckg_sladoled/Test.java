package pckg_sladoled;

public class Test {

    public static void main(String[] args) {
        VanillaFlavorIceCream vanillaFlavorIceCream = new VanillaFlavorIceCream(1, 2);
        ChocolateFlavoredIceCream chocolateFlavoredIceCream = new ChocolateFlavoredIceCream(2,2, vanillaFlavorIceCream);
        BlackChocoTopping iceCream = new BlackChocoTopping(1, 1, chocolateFlavoredIceCream);
        iceCream.calculateTotalPrice();
        System.out.println(iceCream);
        AbsSladoled sladoled = new WallnutPowder(1, 1.5, iceCream);
        sladoled.calculateTotalPrice();
        System.out.println(sladoled);
    }
}
