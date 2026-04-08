package innerclass.local_innerclass;

public class Canvas {
    public void drawShape(String shape){
        
        class Drawer{
            
            public void draw(){
                if(shape.equals("circle")){
                    System.out.println("*********** Circle *********");
                }
                if(shape.equals("square")){
                    System.out.println("********** Square **********");
                }
            }
        }

        Drawer drawer = new Drawer();
        drawer.draw();
    }
}
