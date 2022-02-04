class New implements Runnable {
    public void run() {
        System.out.println("Hi, This is a thread");
    }
}

public class RunnableThread {
    public static void main(String args[]) {
        New obj = new New();
        Thread t = new Thread(obj);
        t.start();
    }
}
