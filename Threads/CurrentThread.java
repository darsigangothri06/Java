class CT implements Runnable {
    public void run() {
        System.out.println("T1 in ct");
        Thread t1 = Thread.currentThread();
        System.out.println(t1);
    }
}

class CT2 implements Runnable {
    public void run() {
        System.out.println("T2");
        Thread t1 = Thread.currentThread();
        System.out.println(t1);
    }
}

public class CurrentThread {
    public static void main(String args[]) {
        CT obj1 = new CT();
        Thread t = new Thread(obj1);
        System.out.println(t.currentThread());
        t.start();
        CT2 obj2 = new CT2();
        t = new Thread(obj2);
        t.start();
    }
}
