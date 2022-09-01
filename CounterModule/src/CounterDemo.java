public class CounterDemo {

    public static void main(String[] args) {
        // Create two counters
        Counter myCounter = new Counter();
        Counter yourCounter = new Counter();

        // Increment them with different steps
        myCounter.increment(4);
        myCounter.increment();
        yourCounter.increment(2);

        // Print the counter values
        System.out.println("Counter 1: " + myCounter.getValue());
        System.out.println("Counter 2: " + yourCounter.getValue());
    }
}
