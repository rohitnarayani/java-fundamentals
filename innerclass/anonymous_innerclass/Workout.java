package innerclass.anonymous_innerclass;

public abstract class Workout {
    abstract void exercise();
    void start(){
        exercise();
        System.out.println("Workout Completed...");
    }
}
