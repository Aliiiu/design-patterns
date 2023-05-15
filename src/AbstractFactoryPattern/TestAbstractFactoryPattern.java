package AbstractFactoryPattern;
/*
Abstract Factory Pattern
The Abstract Factory pattern is used to create families of related
objects without specifying their concrete classes.it provides an interface for creating
families of related or dependent objects without specifying their
concrete classes (Client). It allows you to encapsulate a group of individual
factories that have a common theme. This pattern is useful when you
need to create related objects that need to work together, and you
want to ensure that the objects created are compatible with each other.
It is often used in GUI toolkits, database access layers, and network communication frameworks.

The Abstract Factory Pattern consists of four main components:

Abstract Factory: Defines the interface for creating abstract product objects.
Concrete Factory: Implements the Abstract Factory and creates concrete product objects.
Abstract Product: Defines the interface for creating specific product objects.
Concrete Product: Implements the Abstract Product and provides a specific
                  implementation of the product.
 */
public class TestAbstractFactoryPattern {

    public static void main (String[] args){
        WidgetFactory factory = new WindowsWidgetFactory();
        Button button = factory.createButton();
        button.render(); // Output: Windows button rendered.

        factory = new MacWidgetFactory();
        Button macButton = factory.createButton();
        macButton.render(); // Output: Mac text field rendered.
    }
}
