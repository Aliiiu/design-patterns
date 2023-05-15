package DecoratorPattern;

/*
The Decorator pattern is a structural design pattern that allows
you to add new behavior to an object dynamically by placing them
inside special wrapper objects that contain the same interface
as the original object. The wrapper objects, or decorators,
can add new functionality before or after the original object
method is called. This pattern follows the open/closed principle,
meaning that classes should be open for extension but closed for modification.

This pattern is often used in GUI toolkits, where you can
add new components to existing ones, or in logging frameworks,
where you can add new logging behavior to a class.
 */
public class PizzaDecoratorTest {
    public static void main(String[] args){
        Pizza myPizza = new Margherita();
        myPizza = new Cheese(myPizza);
        myPizza = new Pepperoni(myPizza);

        System.out.println("Description: " + myPizza.getDescription());
        System.out.println("Cost: $" + myPizza.getCost());

    }
}
