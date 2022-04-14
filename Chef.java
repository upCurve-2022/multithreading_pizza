
class Chef implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (true) {
            synchronized (Main.orders) {
                if (! Main.orders.isEmpty()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("chef " + Thread.currentThread().getName() + " has halted.");
                    }
                    System.out.println("********* " + Main.orders.remove() + " dispatched. **********");
                }
            }
            i++;
        }
    }
}