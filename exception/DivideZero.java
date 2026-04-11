package exception;
import java.util.Scanner;

public class DivideZero {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int i,a,b,ans;
        for(i=1;i<=5;i++){
            System.out.print("Enter a: ");
            a = sc.nextInt();

            System.out.print("Enter b: ");
            b = sc.nextInt();

            ans = divide(a,b);

            System.out.println("Answer: "+ans);
            System.out.println();
            System.out.println();
        }
    }
    
    public static int divide(int a,int b){
        try{
            return a/b;
        }
        catch(Exception e){
            System.out.println("Denominator cannot be zero \"0\"");
            // System.out.println(e.getMessage());
            // System.out.println(e.getStackTrace());
            return -1;
        }
    }
}
