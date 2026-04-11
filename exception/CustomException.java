package exception;
import java.util.Scanner;
public class CustomException {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        CustomException ce = new CustomException();
        try{
            ce.registerVoter(age);
        }
        catch(InvalidAgeException e){
            System.out.println(e);
        }
    }

    public void registerVoter(int age) throws InvalidAgeException{
        if(age < 0){
            throw new InvalidAgeException("Age cannot be negative!");
        }
        else if(age < 18){
            throw new InvalidAgeException("Age "+age+" is below voting age of 18!");
        }
        else{
            System.out.println("✅ Voter registered successfully! Age: "+age);
        }
    }
}

class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
