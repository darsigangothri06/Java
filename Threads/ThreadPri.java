class Test extends Thread {
    public void run() {
        System.out.println("Running thread name is: " + Thread.currentThread().getName());
        System.out.println("Running thread priority of " + Thread.currentThread().getName() + " is:"
                + Thread.currentThread().getPriority());
    }
}

public class ThreadPri {
    public static void main(String args[]) {
        Test m1 = new Test();
        Test m2 = new Test();

        m1.setName("X");
        m2.setName("Y");

        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY);

        m1.start();
        m2.start();
    }
}
