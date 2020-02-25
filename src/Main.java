// Java program to illustrate
// ThreadPool
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
    // Maximum number of threads in thread pool
    static final int MAX_T = 3;

    public static void main(String[] args)
    {
        // creates runnable task from pool
        Runnable r1 = new Task1();
        // Creates Thread task
        Task2 r2 = new Task2();
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

            pool.execute(r1);
            r2.start();

        // pool shutdown
        pool.shutdown();
    }

}
