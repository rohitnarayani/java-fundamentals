package generics.gconstructor;

public class Test {
    public <T> Test(T value){
        System.out.println(value);
    }

    public static void main(String []args){
        Test t = new Test("Hello");
        Test x = new Test(12);
    }
}
