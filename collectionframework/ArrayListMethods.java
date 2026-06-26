package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>(11);
        System.out.println(list.getClass().getName());

        String []array = {"King","ding","dong"};
        List<String> arrayList = Arrays.asList(array);
        System.out.println(arrayList.getClass().getName());

        List<Double> weight = Arrays.asList(58.5,93.4);//can not add items in this type of list because
        System.out.println(weight.getClass().getName());//it returns fixed size ArrayList , but you can replace items.
        // weight.add(90.3);//UnsupportedOperationException

        List<Integer> age = List.of(10,20,40); // it also returns unmodifiable list , you can't even replace elements.
        System.out.println(age);

        
        
        
        list.add(1000);
        list.add(200);
        list.add(302);
        list.add(403);
        list.add(503);
        
        // List to array conversion...
        Object []array2 = list.toArray();
        list.toArray(new Integer[0]);
        
        list.sort(null);

        // list.add(50);
        // list.add(50);
        // list.add(50);
        // list.add(50);
        // list.add(50);
        // list.add(50);
        // list.add(1,-90);stores an element at given index and shifts the previous element to the next position
        // list.set(1,-9000);
        // System.out.println(list.get(0));
        // System.out.println(list.get(1));
        // System.out.println(list.get(3));//IndexOutOfBoundsException

        // for(int x:list){
        //     System.out.println(x);
        // }

        // System.out.println("Arraylist size: "+list.size());

        // System.out.println(list.remove(2)); // Accepts index as an input, returns and remove an element from an array
        // System.out.println(list.remove(90));//IndexOutOfBoundsException
        
        // System.out.println(list.size());
    }
}