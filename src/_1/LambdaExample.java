package _1;

import java.time.Instant;
import java.util.Date;

@FunctionalInterface
interface Callback {

    void onDateChanged(Date date);

}

public class LambdaExample {

    private static Callback callback = date -> System.out.println("New date " + date);

    public static void main(String[] args) throws InterruptedException {
        SystemClockObserver systemClockObserver = new SystemClockObserver();
        systemClockObserver.startObserve(callback);
    }
}


class SystemClockObserver {

    public SystemClockObserver() {
    }

    public void startObserve(Callback callback) throws InterruptedException {
        Thread.sleep(5000L);
        callback.onDateChanged(Date.from(Instant.now()));
    }
}
