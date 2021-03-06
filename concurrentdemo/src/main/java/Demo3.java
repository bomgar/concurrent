import java.util.LinkedList;
import java.util.List;

public class Demo3 {


    private int number = 0;

    private List<Thread> threads = new LinkedList<>();

    public int run() throws InterruptedException {
        for (int count = 0; count < 10; count++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                        synchronized (Demo3.class){

                            number++;
                        }
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
        return number;

    }

    public static void main(String[] args) throws InterruptedException {

        new Demo3().run();

    }


}
