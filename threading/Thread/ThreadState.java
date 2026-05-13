package threading.Thread;
import java.lang.Thread;


public class ThreadState extends Thread {

    public void run(){
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String []args) throws InterruptedException{
        ThreadState t1 = new ThreadState();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
        
    }
}
