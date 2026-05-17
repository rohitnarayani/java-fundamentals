package threading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    final Lock lock = new ReentrantLock();

    public void outer(){
        lock.lock();

        try{
            System.out.println("Outer Method");
            inner();
        }
        finally{
            lock.unlock();
        }
    }

    public void inner(){
        lock.lock();
        try{
            System.out.println("inner method");
        }
        finally{
            lock.unlock();
        }
    }

    public static void main(String []args){
        ReentrantExample example = new ReentrantExample();
        example.outer();
    }
}