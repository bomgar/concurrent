import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo4 {


    private AtomicInteger number = new AtomicInteger(0);

    private List<Thread> threads = new LinkedList<>();

    public int run() throws InterruptedException {
        for (int count = 0; count < 10; count++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                        number.getAndIncrement();
                    }
                }
            });
            t.start();
            threads.add(t);
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println(number);

        return number.get();

    }

    public static void main(String[] args) throws InterruptedException {

        new Demo4().run();

    }


}
