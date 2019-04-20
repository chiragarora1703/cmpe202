For this lab, I am using Strategy Pattern.

Strategy Pattern is when a class behavior or its algorithm is changed at run time.
This type of design pattern comes under behavior pattern.

Generally the pattern consist of multiple implementations of an abstract class or interface. There is a client which consumes
or uses Interface object and call the executing method on it.

I am taking example of GOF Strategy Pattern where author showed how different sorting strategies are implemented using Strategy
 Pattern. In the interface SortingStrategy we have sort method which is implemented by different sorting algorithms /
 strategies such as BubbleSort, InsertionSort

Tester ---> Testing class <br />
Strategy ---> SortingStrategy (Common interface between different strategy) <br />
ConcreteStrategy1 ---> BubbleSort(Bubble sorting strategy) <br />
ConcreteStrategy2 ---> InsertionSort(Insertion sorting strategy) <br />

In my example, I have used both the traditional and lambda implementation.
In the case of traditional implementation, we have multiple classes as different concrete strategies implementing a common
interface (SortingStrategy)

Here we are binding the strategy implementation (a class) to the Strategy Client / Tester.
```
    dataSet.changeStrategy(new InsertionSort());
```

In the case of Lambda implementation, we have different implementations / strategies as a function. Note : IStrategy interface
is now a functional interface which means it cannot consists of more than 1 function.

Also now, instead of creating multiple classes and implementing the interface, we have lambda functions defined for each operation

In this example, we are binding a function to the strategy client
```
 dataSet.changeStrategy(SortStrategies.INSERTION_SORT);
```

the following is the implementation of different strategies using lambda functions.
```
  public static SortingStrategy BUBBLE_SORT = (data) -> { ... }
  public static SortingStrategy INSERTION_SORT = (data) -> { ... }
```
