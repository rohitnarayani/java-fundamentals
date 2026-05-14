package threading.Thread;

public class ThreadMethod extends Thread {

    // public ThreadMethod(String name){
    //     super(name);
    // }

    public void run(){

        // try{
        //     for(int i=0;i<5;i++){
        //         System.out.println(Thread.currentThread().getName()+": Priority: "+Thread.currentThread().getPriority()+": count-"+i);
        //         Thread.sleep(1000);
        //     }
        // }
        // catch(InterruptedException e){
        //     System.out.println(e);
        // }

        // for(int i=1;i<=5;i++){
        //     System.out.println(Thread.currentThread().getName()+" is running");
        //     Thread.yield();
        // }

        while(true){
            System.out.println("Hello World");
        }
    }
    public static void main(String []args){
        // ThreadMethod t1 = new ThreadMethod("T1");
        // ThreadMethod l = new ThreadMethod("Low Priority Thread");
        // ThreadMethod m = new ThreadMethod("Medium Priority Thread: ");
        // ThreadMethod h = new ThreadMethod("High Priority Thread");

        // h.setPriority(MAX_PRIORITY);
        // l.setPriority(MIN_PRIORITY);
        // m.setPriority(NORM_PRIORITY);

        // l.start();
        // m.start();
        // h.start();

        ThreadMethod t1 = new ThreadMethod();
        ThreadMethod t2 = new ThreadMethod();
        
        t1.setDaemon(true);
        t1.start();
        t2.start();
        System.out.println("Main Finished...");
        // t1.interrupt();
    }
}
