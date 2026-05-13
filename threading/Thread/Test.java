package threading.Thread;
import java.lang.Thread;

class Hello extends Thread{
    public void run(){
        for(int i=1;i<1000;i++){
            System.out.println("Hello");
        }
    }
}

class World extends Thread{
    public void run(){
        for(int i=1;i<1000;i++){
            System.out.println("World");
        }
    }
}

class Odd extends Thread{
    public void run(){
        for(int i=1;i<100;i+=2){
            System.out.println("Odd: "+i);
        }
    }
}

class Even extends Thread{
    public void run(){
        for(int i=0;i<100;i+=2){
            System.out.println("Even: "+i);
        }
    }
}
public class Test {
    public static void main(String []args){
        Odd odd = new Odd();
        Even even = new Even();

        odd.start();
        even.start();
    }
}
