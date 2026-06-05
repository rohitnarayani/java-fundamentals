package generics.gclass;

import java.util.ArrayList;

public class Stack<T> {
    ArrayList<T> stack = new ArrayList<>();

    public void push(T x){
        stack.add(x);
    }

    public  T pop(){
        T popedElement =  stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return popedElement;
    }

    public T peek(){
        return stack.get(stack.size()-1);
    }

    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return stack.size();
    }

    public String toString(){
        return "Items: "+stack;
    }
    public static void main(String []args){
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        integerStack.push(40);

        System.out.println(integerStack);
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        // System.out.println(integerStack.peek());
        // System.out.println(integerStack);
        System.out.println(integerStack.isEmpty());
        System.out.println(integerStack.size());
    }
}