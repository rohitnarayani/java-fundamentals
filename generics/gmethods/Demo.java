package generics.gmethods;

public class Demo {
    
    public <T> void printArray(T[] array){
        for(T item : array){
            System.out.println(item);
        }
    }

    public static void main(String []args){
        Integer[] arr = {19,29,39,49,59};
        String[] stringArray = {"Hello","World"};
        Demo d = new Demo();
        d.printArray(arr);
        d.printArray(stringArray);
    }
}
