class MultiP extends Thread {
    String x;

    MultiP(String y) {
        x = y;
    }

    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.println("Thread 1 : " + i);
    }
}

class MultiPi extends Thread {
    String x;

    MultiPi(String y) {
        x = y;
    }

    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.println("Thread 2 : " + i);
    }
}

public class Join {
    public static void main(String args[]) {
        MultiP obj1 = new MultiP("darsi");
        MultiPi obj2 = new MultiPi("gangothri");
        Thread t = new Thread(obj1);
        Thread t1 = new Thread(obj2);
        t.start();
        try {
            t.join(); // to get seperate order, we use join() method
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        for (int i = 1; i <= 5; i++)
            System.out.println("4306");
    }
}
