package generics.typebound;

interface demo<K>{
    void print(K item);
}

class MyClass<T> extends Thread implements demo<T>{
    public void print(T item){
        System.out.println(item);
    }
}

public class Main <T extends Thread & demo<K>,K> {

    MyClass<K> myClass;

    Main(MyClass<K> myClass){
        this.myClass = myClass;
    }

    public void callPrint(K item){
        myClass.print(item);
    }
    public static void main(String args[]){
        MyClass<Integer> m = new MyClass<>();
        Main<MyClass<Integer>,Integer> ob = new Main<>(m);
        ob.callPrint(29);
    }
}  
