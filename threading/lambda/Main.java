package threading.lambda;

public class Main {
    public static void main(String []args){
        Student lawStudent = (String name) -> {System.out.println(name+" is a Law student");};
        lawStudent.getBio("Rohit");

        Student engineer = name -> System.out.println(name+" is a engineer");
        engineer.getBio("Gogi");
        
    }
}
