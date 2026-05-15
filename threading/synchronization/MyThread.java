package threading.synchronization;

public class MyThread extends Thread{
    Counter counter;

    MyThread(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for(int i=0;i<1000;i++){
            // System.out.println(Thread.currentThread().getName()+": count: "+counter.getCount());
            counter.increment();
        }
    }
}