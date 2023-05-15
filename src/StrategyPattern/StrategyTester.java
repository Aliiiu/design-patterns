package StrategyPattern;

/*

The Strategy pattern is a behavioral pattern that enables selecting an algorithm at runtime.
It defines a family of algorithms, encapsulates each one, and makes them interchangeable.
The Strategy pattern allows the algorithm to vary independently of the clients that use it.

Real-world example
The Strategy pattern can be useful in real-world scenarios where
you need to choose between multiple algorithms depending on the
input data or the desired output. For example, in a stock trading
system, the algorithm for predicting stock prices may vary
depending on the type of stocks or the market conditions.
By using the Strategy pattern, you can encapsulate each
algorithm into a separate class and choose the appropriate algorithm at runtime.
 */
public class StrategyTester {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };

        Sorter sorter = new Sorter(new BubbleSort());
        sorter.sort(arr);

        sorter.setStrategy(new QuickSort());
        sorter.sort(arr);
    }
}
