package decorator;

public class ChocolateCone implements IceCream {
    //Chocolate Cone can behave like a base as well as Addon.
    private IceCream iceCream;

    public ChocolateCone() {}

    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        if (iceCream != null) {
            return iceCream.getDescription() + " + Chocolate Cone";
        }
        return "Chocolate Cone";
    }

    @Override
    public int getCost() {
        if (iceCream != null) { // Chocolate Cone is behaving like a addon
            return iceCream.getCost() + 15;
        }
        return 15; // base.
    }
}
