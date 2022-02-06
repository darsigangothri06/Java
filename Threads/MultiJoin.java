class MyThread extends Thread {
    public void run() {
        System.out.println("Currently Executing Thread: " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName() + "Priority is: " + Thread.currentThread().getPriority());
    }
}

public class MultiJoin {
    public static void main(String args[]) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

        t1.setName("Important");
        t1.setPriority(10);

        t2.setName("News");
        t2.setPriority(1);

        t1.start();
        try {
            t1.join();
            t2.start();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
