package exception;
import java.util.Scanner;

public class NumberFormat {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        for(int i=1;i<=3;i++){
            System.out.print("Enter age: ");
            String number = sc.nextLine();
            try{
                Integer.parseInt(number);
                System.out.println("✅ Your age is: "+number);
            }
            catch(NumberFormatException e){
                System.out.println("❌ Invalid input! Age must be a number. You entered: "+number);
            }
            System.out.println();
        }
    }   
}