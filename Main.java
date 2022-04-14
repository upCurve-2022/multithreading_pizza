

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static ConcurrentLinkedQueue<String> orders = new ConcurrentLinkedQueue<>();
    public static Integer orderNo = 1;
    public static void main(String[] args) {

        Thread CounterThread1 = new Thread(new Counter());
        CounterThread1.setName(" 1 ");

        Thread CounterThread2 = new Thread(new Counter());
        CounterThread2.setName(" 2 ");

        Thread CounterThread3 = new Thread(new Counter());
        CounterThread3.setName(" 3 ");

        Thread chefThread1 = new Thread(new Chef());
        chefThread1.setName(" 1 ");

        Thread chefThread2 = new Thread(new Chef());
        chefThread2.setName(" 2 ");

        Thread chefThread3 = new Thread(new Chef());
        chefThread3.setName(" 3 ");

        CounterThread1.start();
        CounterThread2.start();
        CounterThread3.start();

        chefThread1.start();
        chefThread2.start();
        chefThread3.start();
    }
}