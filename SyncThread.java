public class SyncThread extends  Thread{

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread t1 = new Thread(() ->{
            for(int i = 0; i < 5; i++) {
                synchronized (lock) {
                    System.out.println("ping");
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t2 = new Thread(() ->{
        for(int i = 0; i < 5; i++) {
            synchronized (lock) {
                System.out.println("pong");
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        });

        t1.start();
        t2.start();

    }

}
