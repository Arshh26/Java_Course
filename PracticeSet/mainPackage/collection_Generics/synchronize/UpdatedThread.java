package mainPackage.collection_Generics.synchronize;

public class UpdatedThread extends Thread{

    private final Counter counter;

    public UpdatedThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5000; i++) {
            counter.increment();
        }
    }
}
