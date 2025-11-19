package pckg_sladoled;

public abstract class AbsSladoled {

    protected double price;
    protected final int amount = 1;
    protected AbsSladoled absSladoled;

    protected AbsSladoled(double price) {
        this.price = price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    /*protected void setAmount(int amount) {
        this.amount = amount;
    }*/

    protected abstract double calculateTotalPrice();
}
