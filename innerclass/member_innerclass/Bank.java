package innerclass.member_innerclass;

public class Bank {
    private String accountHolderName;
    private double balance;

    Bank(String ahn){
        this.accountHolderName = ahn;
        this.balance=0;
    }

    class Transaction{
        public void deposit(double amount){
            if(amount<=0){
                System.out.println("Add sufficient amount");
                return;
            }
            balance += amount;
            System.out.println("Deposited: "+amount+" | Balance: "+balance);
            System.out.println("Account credited successfully...");
        }

        public void withdraw(double amount){
            if(amount<=0){
                System.out.println("Enter sufficient amount");
                return;
            }
            else if(balance<amount){
                System.out.println("Not enough balance");
            }
            else{
                balance -= amount;
                System.out.println("Withdrawn: "+amount+" | Balance: "+balance);
                System.out.println("Account debited successfully...");
            }
        }
        public void display(){
            System.out.println("Account: "+accountHolderName);
            System.out.println("Current Balance: "+balance);
        }
    }
}
