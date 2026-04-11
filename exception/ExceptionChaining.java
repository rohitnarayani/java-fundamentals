package exception;
import java.util.Scanner;
public class ExceptionChaining {
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        
        int a,b;
        System.out.print("Enter numerator: ");
        a = sc.nextInt();
        System.out.print("Enter denominator: ");
        b = sc.nextInt();
        try{
        divide(a,b);
        }
        catch(Exception e){
            StackTraceElement[] stackTrace = e.getStackTrace();

            for(int i=0;i<stackTrace.length;i++){
                System.out.println(stackTrace[i]);
            }
        }
    }
    public static void divide(int a,int b){
        divide2(a,b);
    }
    public static void divide2(int a,int b){
        divide3(a,b);
    }
    public static void divide3(int a,int b){
        System.out.println(a/b);
    }
}
