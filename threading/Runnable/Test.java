package threading.Runnable;
import java.lang.Runnable;
import java.lang.Thread;

class Hello implements Runnable{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class World implements Runnable{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Test {
    public static void main(String []args){
        Hello hello = new Hello();
        World world = new World();
        Thread t1 = new Thread(hello);
        t1.setName("Hello");
        t1.start();

        Thread t2 = new Thread(world);
        t2.setName("World");
        t2.start();
    }
}