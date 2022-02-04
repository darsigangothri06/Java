class NewT extends Thread {
    public void run() {
        System.out.println("HI");
    }
}

public class FirstThread {
    public static void main(String args[]) {
        NewT obj = new NewT();
        obj.start();
        Thread t = new Thread();
        System.out.println(t.currentThread());
    }
}