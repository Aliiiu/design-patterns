package StrategyPattern;

// Strategy interface
interface SortingStrategy {
    void sort(int[] arr);
}

// Concrete strategy 1
class BubbleSort implements SortingStrategy {
    public void sort(int[] arr) {
        // Bubble sort algorithm implementation
        // ...
        System.out.println("Bubble sort");
    }
}

// Concrete strategy 2
class QuickSort implements SortingStrategy {
    public void sort(int[] arr) {
        // Quick sort algorithm implementation
        // ...
        System.out.println("Quick sort");
    }
}

// Context class that uses the strategy
class Sorter {
    private SortingStrategy strategy;

    public Sorter(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] arr) {
        strategy.sort(arr);
    }
}
