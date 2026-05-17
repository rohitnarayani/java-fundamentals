package threading.locks;

public class BankMain {
    public static void main(String []args){
        BankAccount sbi = new BankAccount(2000);

        Runnable transaction = new Runnable(){
            public void run(){
                sbi.withdraw(1000);
            }
        };

        Thread t1 = new Thread(transaction,"Thread-1");
        Thread t2 = new Thread(transaction,"Thread-2");
        t1.start();
        t2.start();
    }
}
