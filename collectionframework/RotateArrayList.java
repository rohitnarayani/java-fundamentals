package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class RotateArrayList {
    public static void main(String []args){
        List<Integer> arrayList = new ArrayList<>();
        int k = 20;
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        System.out.println("Original List: ");
        System.out.println(arrayList);
        System.out.printf("Rotate List Right by %d: ",k);
        rotateListRight(arrayList,k);
        System.out.printf("Rotate List Left by %d: ",k);
        rotateListLeft(arrayList,k);
    }

    public static void rotateListRight(List<Integer> list,int k){
        List<Integer> firstPart = new ArrayList<>();
        List<Integer> lastPart = new ArrayList<>();

        k = k % list.size();
        if(k == 0){
            System.out.println(list);
            return;
        }
        for(int i=0;i<=list.size()-k-1;i++){
            firstPart.add(list.get(i));
        }

        for(int i=list.size()-k;i<list.size();i++){
            lastPart.add(list.get(i));
        }

        // System.out.println(firstPart);
        // System.out.println(lastPart);
        lastPart.addAll(firstPart);
        System.out.println(lastPart);
    }

    public static void rotateListLeft(List<Integer> list,int k){
        List<Integer> firstPart = new ArrayList<>();
        List<Integer> lastPart = new ArrayList<>();

        k = k % list.size();
        if(k == 0){
            System.out.println(list);
            return;
        }
        for(int i=0;i<=k-1;i++){
            firstPart.add(list.get(i));
        }

        for(int i=k;i<list.size();i++){
            lastPart.add(list.get(i));
        }

        // System.out.println(firstPart);
        // System.out.println(lastPart);
        lastPart.addAll(firstPart);
        System.out.println(lastPart);
    }  
}