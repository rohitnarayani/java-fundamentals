package exception;
import java.util.Scanner;


public class CheckArrayIndex {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        CheckArrayIndex ob = new CheckArrayIndex();
        int arr[] = {10,20,30,40,50,60};
        int i,index;
        for(i=1;i<=4;i++){
            System.out.print("Enter index of element: ");
            index = sc.nextInt();

            int element = ob.getElement(arr,index);
            
            if(element!=-1){
                System.out.printf("Element at index %d is %d",index,element);                
            }
            System.out.println();
            System.out.println();
        }
    }

    public int getElement(int arr[],int index){
        try{
            return arr[index];
        }
        catch(ArrayIndexOutOfBoundsException ob){
            System.out.println("❌ Invalid index! Valid range is 0 to 5.");
            return -1;
        }
    }
}