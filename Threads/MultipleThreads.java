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

public class MultipleThreads {
    public static void main(String args[]) {
        MultiP obj1 = new MultiP("darsi");
        MultiPi obj2 = new MultiPi("gangothri");
        Thread t = new Thread(obj1);
        Thread t1 = new Thread(obj2);
        t.start();
        t1.start();
        for (int i = 1; i <= 5; i++)
            System.out.println("4306");
    }
}
