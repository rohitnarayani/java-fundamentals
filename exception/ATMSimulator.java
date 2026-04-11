package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMSimulator {
    private double balance;

    ATMSimulator(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(amount < 0){
            throw new IllegalArgumentException();
        }
        else if(amount > balance){
            throw new ArithmeticException();
        }
        else{
            balance -= amount;
            System.out.println("✅ Withdrawal successful! Remaining: ₹"+this.balance);
        }
    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        ATMSimulator ob = new ATMSimulator(90);
        
        System.out.print("Enter amount to be withdraw: ");
        
        try{
            double amount = sc.nextDouble();
            ob.withdraw(amount);
        }
        catch(InputMismatchException e){
            System.out.println("❌ Please enter a valid amount!");
        }
        catch(IllegalArgumentException e){
            System.out.println("❌ Amount cannot be negative!");
        }
        catch(ArithmeticException e){
            System.out.println("❌ Insufficient balance! Available: ₹"+ob.balance);
        }
        
    }
}
