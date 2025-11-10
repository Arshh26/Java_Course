package mainPackage.collection_Generics.MultiThreading;

import java.util.TimerTask;

public class NeedOfMultiThreading {
    public static void main(String[] args) {

        long time = System.currentTimeMillis();

        //first task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%s* ", i);
            System.out.println("Completed * task");
        }

        //Second task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%s$ ", i);
            System.out.println("Completed $ task");
        }

        //Third task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%s# ", i);
            System.out.println("Completed # task");
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime);

        System.out.println(endTime - time);


    }
}
