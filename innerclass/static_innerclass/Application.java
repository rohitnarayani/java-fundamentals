package innerclass.static_innerclass;

public class Application {
    static class MathUtils{
        public static void square(int n){
            System.out.println("Square of "+n+" is "+(n*n));
        }

        public static void isPrime(int n){
            boolean prime = true;
            if(n<=1){
                System.out.println("Enter valid number...");
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    prime = false;
                }
            }
            if(prime){
                System.out.println(n+" is a prime number...");
            }
            else{
                System.out.println(n+" is not a prime number...");
            }
        }

        public static void cube(int n){
            System.out.println("Cube of "+n+" is "+(n*n*n));
        }
    }
}
