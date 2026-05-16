package threading.synchronization;

public class WithdrawThread extends Thread {
    BankAccount bankAccount;
    double amount;

    WithdrawThread(BankAccount ba,double amount){
        bankAccount = ba;
        this.amount = amount;
    }

    public void run(){
        bankAccount.withdraw(amount);
    }
}
