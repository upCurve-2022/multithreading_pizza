

import java.util.Scanner;

class Counter implements Runnable {

    @Override
    public void run() {
        String dish;

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i < 2) {

            synchronized (Main.orders) {
                System.out.print("   Enter dish : ");
                dish = "Order " + Main.orderNo++ + " : " + sc.next();
                Main.orders.add(dish);
                System.out.println("   Counter" + Thread.currentThread().getName() + " takes in " + dish + "\n");
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("counter" + Thread.currentThread().getName() + " has halted.");
            }

            i++;
        }
    }
}