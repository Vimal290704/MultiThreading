package Synchronization.Problem;

public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public void increment() {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }
}
