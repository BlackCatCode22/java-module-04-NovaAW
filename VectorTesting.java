import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VectorTesting {
    public static void main(String[] args) throws InterruptedException {
        int size = 1000000;

        
        List<Integer> multithreadedList = Collections.synchronizedList(new ArrayList<>());

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multithreadedList.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multithreadedList.add(i);
            }
        });

        long start = System.currentTimeMillis();

        t1.start();
        t2.start();


        t1.join();
        t2.join();

        long end = System.currentTimeMillis();

        System.out.println("Added " + multithreadedList.size() + " elements to synchronizedList in " + (end - start) + " ms");
    }
}