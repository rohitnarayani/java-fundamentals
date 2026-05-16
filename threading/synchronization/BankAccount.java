package threading.synchronization;

public class BankAccount extends Thread{
    private double balance;

    BankAccount(){
        balance = 0;
    }

    BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Enter valid amount...");
            return;
        }

        if(amount > balance || balance <=0){
            System.out.println("Not sufficient balance");
            return;
        }

        balance -= amount;
        System.out.println(amount+" withdrawn successfully...");
        return;
    }
}