/**
 * Measures the costs of thread creation.
 */
public class ThreadDemo1 {

    public long run(boolean asThread) throws InterruptedException {
       long start = System.currentTimeMillis();
       for(int i = 0; i < 10000; i++){
           Thread thread = new Thread();
           if(asThread) {
               thread.start();
           }else {
               thread.run();
           }
       }

        return System.currentTimeMillis() - start;
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 10; i++) {
            System.out.println("Diff between Thread and Seq:" + (new ThreadDemo1().run(true) - new ThreadDemo1().run(false)));
        }
    }
}
