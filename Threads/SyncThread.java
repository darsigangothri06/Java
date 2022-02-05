class MyThread extends Thread {
    int count;

    public synchronized void run() {
        for (int i = 1; i <= 10000; i++)
            count++;
        System.out.println(Thread.currentThread().getName());
    }
}

public class SyncThread {
    public static void main(String args[]) {
        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(obj.count);
    }
}
