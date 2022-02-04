class NewT extends Thread {
    public void run() {
        System.out.println("HI");
    }
}

public class FirstThread {
    public static void main(String args[]) {
        NewT obj = new NewT();
        Thread t = new Thread(obj);
        t.start();
        System.out.println(t.currentThread());
    }
}