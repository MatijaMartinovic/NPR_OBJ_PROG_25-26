package pckg_sladoled;

public abstract class IceCreamDecorator extends AbsSladoled{

    private double totalPrice;

    protected AbsSladoled sladoled;

    protected IceCreamDecorator(double price, AbsSladoled sladoled) {
        super(price);
        this.sladoled = sladoled;
    }
}
