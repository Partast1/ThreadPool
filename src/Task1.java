import java.time.Duration;
import java.time.Instant;

public class Task1 implements Runnable {
    // Prints task name and sleeps for 1s
    // This Whole process is repeated 5 times
    public void run()
    {
        Instant start = Instant.now();
        for (int i = 0; i < 200000; i++) {
            System.out.print("Task 1 is being executed");
        }
        Instant ends = Instant.now();

        System.out.println("\n" + Duration.between(start, ends));
    }
}
