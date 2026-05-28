package threading.synchronization;

public class Test {
    public static void main(String []args){
        // In Test.java
        for(int run = 0; run < 5; run++){
            Counter counter = new Counter();
            MyThread t1 = new MyThread(counter);
            MyThread t2 = new MyThread(counter);
            t1.start(); 
            t2.start();
            try{
                t1.join();  
                t2.join();
            }catch(Exception e){}
            if(counter.getCount() != 20000){
                System.out.println("run " + run + ": " + counter.getCount());
            }
        }      
// You WILL see wrong results in some runs
    }
}