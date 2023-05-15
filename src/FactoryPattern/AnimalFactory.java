package FactoryPattern;

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}
abstract class AnimalFactory {
    public abstract Animal factoryMethod();

    public void doSomething() {
        Animal animal = factoryMethod();
        animal.makeSound();
    }
}

class DogFactory extends AnimalFactory {
    public Animal factoryMethod() {
        return new Dog();
    }
}

class CatFactory extends AnimalFactory {
    public Animal factoryMethod() {
        return new Cat();
    }
}
