package ObserverPattern;

/*
This is a design pattern that defines a one-to-many dependency between objects so that when one object
changes state, all its dependents are notified and updated automatically. A new pattern
for communicating state to a set of objects in a loosely coupled manner.

Contains 4 Components
- The Observer Interface
- The Subject Interface - (Add, Remove, Notify)
- The ConcreteObserver Class
- The ConcreteSubject Class
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver("Observer 1"));
        subject.addObserver(new ConcreteObserver("Observer 2"));
        subject.addObserver(new ConcreteObserver("Observer 3"));

        subject.notifyObservers("Hello world!");
    }
}
