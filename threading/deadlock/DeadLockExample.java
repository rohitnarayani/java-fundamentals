package threading.deadlock;

class Pen{
    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName()+" using pen and "+this+" trying to use paper");
        paper.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" finished using pen "+this);
    }
}

class Paper{
    public synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName()+" using paper and "+this+" trying to use pen");
        pen.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" finish using paper "+this);
    }
}

class Task1 implements Runnable{
    private Paper paper;
    private Pen pen;

    Task1(Paper paper , Pen pen){
        this.paper = paper;
        this.pen = pen;
    }

    public void run(){
        pen.writeWithPenAndPaper(paper);
    }
}

class Task2 implements Runnable{
    private Paper paper;
    private Pen pen;

    Task2(Paper paper,Pen pen){
        this.paper = paper;
        this.pen = pen;
    }

    public void run(){
        synchronized(pen){
            paper.writeWithPaperAndPen(pen);
        }
    }
}

public class DeadLockExample {  
    public static void main(String []args){
        Paper paper = new Paper();
        Pen pen = new Pen();

        Thread t1 = new Thread(new Task1(paper,pen),"Thead-1");
        Thread t2 = new Thread(new Task2(paper,pen),"Thread-2");

        t1.start();
        t2.start();
    }
}
