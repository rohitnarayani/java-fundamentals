package threading.synchronization;

public class Counter {
    private int count=0;

    public synchronized void increment(){
        int temp = count;
        try{
            Thread.sleep(1);
        }catch(Exception e){}
        count = temp + 1;
    }

    public synchronized int getCount(){
        return count;
    }
}
