package threading.readwritelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {
    private int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment() {
        writeLock.lock();

        try {
            count++;
            Thread.sleep(1000);
        }catch(Exception e){}
        finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();

        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String []args){
        ReadWriteCounter counter = new ReadWriteCounter();

        Runnable writeTask = new Runnable(){
            public void run(){
                for(int i=1;i<=10;i++){
                    counter.increment();
                    System.out.println(Thread.currentThread().getName()+" incremented ");
                }
            }
        };

        Runnable readTask = new Runnable(){
            public void run(){
                for(int i=1;i<=10;i++){
                    System.out.println(Thread.currentThread().getName()+ " read: " +counter.getCount());
                }
            }
        };

        Thread t1 = new Thread(writeTask,"Thread-1");
        Thread t2 = new Thread(readTask,"Thread-2");
        Thread t3 = new Thread(readTask,"Thread-3");

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(Exception e){}

        System.out.println("Final Count: "+counter.count);

    }
}
