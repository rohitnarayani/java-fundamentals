package threading.communication;

class SharedResource{
    private int data;
    private boolean hasData;

    public synchronized void produce(int value){
        while(hasData){
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        data = value;
        hasData = true;
        System.out.println("Produced: "+data);
        notify();
    }

    public synchronized int consume(){
        while(!hasData){
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        hasData = false;
        notify();
        System.out.println("Consumed: "+data);
        return data;
    }
}

class Producer implements Runnable{
    SharedResource sharedResource;

    Producer(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    public void run(){
        for(int i=0;i<10;i++){
            sharedResource.produce(i);
        }
    }
}

class Consumer implements Runnable{
    SharedResource sharedResource;

    Consumer(SharedResource sharedResource){
        this.sharedResource = sharedResource;   
    }

    public void run(){
        for(int i=0;i<10;i++){
          sharedResource.consume();
        }
    }
}
public class ThreadCommunication {
    public static void main(String []args){
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(new Producer(sharedResource));
        Thread consumerThread = new Thread(new Consumer(sharedResource));

        producerThread.start();
        consumerThread.start();
    }
}
