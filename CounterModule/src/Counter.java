// This class models a simple counter
public class Counter { // The class name is: Counter

    private int value; // Counter data

    // The Counter constructor (see below)
    public Counter() {
        value = 0;
    }

    // Advances the counter value by 1
    public void increment() {
        value = value + 1;
    }

    // Advances the counter value by n
    public void increment(int n) {
        value = value + n;
    }

    // Returns the current counter value
    public int getValue() {
        return value;
    }
}
