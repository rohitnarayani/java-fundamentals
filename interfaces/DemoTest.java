package interfaces;

public class DemoTest {
    public static void main(String []args){
        DemoInter demo = (new DemoInter(){
            public void display(){
                DemoInter.showDate();
            }
        });
        
        // demo.display();
        DemoInter.showDate();
        demo.defaultMethod();
    }
}
