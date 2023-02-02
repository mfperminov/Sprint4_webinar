import java.time.Instant;
import java.util.Date;

public class LambdaExample {

    private static Callback callback = date -> System.out.println("new date " + date);
    private static Callback callback2 = date -> System.out.println("Date changed");

    public static void main(String[] args) {
        SystemClockObserver systemClockObserver = new SystemClockObserver();
        systemClockObserver.startObserve(callback);
        ///
        //systemClockObserver.startObserve(callback2);
        /////
        //systemClockObserver.startObserve(callback);
    }
}
@FunctionalInterface
interface Callback {

    void onDateChanged(Date date);

}

class SystemClockObserver {
    Callback callback;

    public SystemClockObserver() {
    }

    public void startObserve(Callback callback) {
        Date date = Date.from(Instant.now());
        if (Date.from(Instant.now()).toString().equals("01.01.2023")) {
            callback.onDateChanged(date);
        }
    }
}
