package exception;

public class Finally {
    public static void main(String []args){
        int a=10,b=0;
        try{
            int c = a/b;
        }
        catch(Exception e){
            System.out.println("Exception generated...");
        }
        finally{
            System.out.println("Hi!! I am finally block and i will be executed whether the exception will be generated or not");
        }
    }
}
