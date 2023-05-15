package DecoratorPattern;

public class Margherita implements Pizza {
    public String getDescription() {
        return "Margherita";
    }

    public double getCost() {
        return 6.99;
    }
}
