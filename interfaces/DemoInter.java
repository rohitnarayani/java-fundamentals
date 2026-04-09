package interfaces;

import java.util.Date;

public interface DemoInter {

    public static void showDate(){
        System.out.println(new Date());
    }
    
    default void defaultMethod(){
        System.out.println("Concrete methods can be written inside the interface using \"default\" access specifier");
    }
    public void display();
}
