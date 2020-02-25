//import java.Stopwatch;
import java.time.Duration;
import java.time.Instant;

class Task2 extends Thread
{

//    Class runned by Thread

//    void nanoTime();

    public void run()
    {
        Instant start = Instant.now();
//        Stopwatch stopwatch =  new Stopwatch();
        for (int i = 0; i < 200000; i++) {
            System.out.print("Task 2 is being executed ");
        }
        Instant ends = Instant.now();
        
        System.out.println("\n" + Duration.between(start, ends));
    }
}