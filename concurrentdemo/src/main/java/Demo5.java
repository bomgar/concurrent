import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo5 {


    private AtomicInteger number = new AtomicInteger(0);

    private List<Thread> threads = new LinkedList<>();

    public int run() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (int count = 0; count < 10; count++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                        number.getAndIncrement();
                    }
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);

        return number.get();

    }



    public static void main(String[] args) throws InterruptedException {

        new Demo5().run();

    }


}
