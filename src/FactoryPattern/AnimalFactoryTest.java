package FactoryPattern;

/*
The Factory Method pattern is a creational pattern that
provides an interface for creating objects in a superclass,
but allows subclasses to alter the type of objects that
will be created. This pattern is useful when we have
multiple classes that implement a similar interface, but
we do not know which class we will need until runtime.
This pattern encapsulate object creation and makes the design more flexible and decoupled.

This pattern is often used in GUI toolkits, where you can
add new components to existing ones, or in logging frameworks,
where you can add new logging behavior to a class.
 */
public class AnimalFactoryTest {

    public static void main(String[] args){
        AnimalFactory factory = new DogFactory();
        factory.doSomething();

        factory = new CatFactory();
        factory.doSomething();
    }
}
