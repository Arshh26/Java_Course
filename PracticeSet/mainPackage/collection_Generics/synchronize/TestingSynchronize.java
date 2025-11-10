package mainPackage.collection_Generics.synchronize;

public class TestingSynchronize {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();
        UpdatedThread t1 = new UpdatedThread(counter);
        UpdatedThread t2 = new UpdatedThread(counter);

        try {
            t1.start();
            t2.join();
            t2.start();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted: " + e.getMessage());
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("Final counter value: %d and Time taken %d",
                counter.getCount(), (endTime - startTime));

    }
}
