package _1;

import java.util.Random;

class Result {
    private int a;
    private String b;
}

class OtherResult {
    private long c;
    private CharSequence charSequence;
}

public class Pair<A, B> {
    public final A first;
    public final B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

}

class Event {}

class PairExampleUsage {

    private static final int NUM_OF_EVENTS = 10;
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < NUM_OF_EVENTS; i++) {
            System.out.println(generateEvent());
            Thread.sleep(new Random().nextInt(200));
        }
    }

    private static Pair<Event, Long> generateEvent() {
        return new Pair<>(new Event(), System.currentTimeMillis());
    }
}
