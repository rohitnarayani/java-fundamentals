package generics.ginterface;


interface interDemo<T>{
    void set(T item);
    T get();
}
public class GenericInterface<T> implements interDemo<T> {
    private T item;

    public void set(T item){
        this.item = item;
    }

    public T get(){
        return item;
    }

    public static void main(String []args){
        GenericInterface<String> demo = new GenericInterface<>();
        demo.set("Hello");
        demo.set("World");

        System.out.println(demo.get());
    }
}