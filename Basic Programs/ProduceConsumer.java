import java.sql.Time;

public class ProduceConsumer {
    public static void main(String agrs[]) {
        Producer t1 = new Producer();
        Consumer t2 = new Consumer(t1);
        t1.start();
        t2.start();
    }

}

class Producer extends Thread {
    StringBuffer sb = new StringBuffer();

    public void run() {
        synchronized (sb) {
            for (int i = 1; i <= 5; i++) {
                sb.append(i + " : ");
                System.out.println("Appending...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
            sb.notify();
        }
    }
}

class Consumer extends Thread {
    Producer prod;

    Consumer(Producer prod) {
        this.prod = prod;
    }

    public void run() {
        synchronized (prod.sb) {
            try {
                wait();
            } catch (Exception e) {
            }
            System.out.println(prod.sb);
        }
    }
}