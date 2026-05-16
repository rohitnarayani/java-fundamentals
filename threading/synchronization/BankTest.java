package threading.synchronization;

public class BankTest {
    public static void main(String []args){
        BankAccount b = new BankAccount(10000);
        WithdrawThread t1 = new WithdrawThread(b,9000);
        WithdrawThread t2 = new WithdrawThread(b,3000);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Current Balance: "+b.getBalance());
    }
}
