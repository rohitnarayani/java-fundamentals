public class EnumDemo{
    enum TrafficLight{
        RED("Laal"),
        YELLOW("Pido"),
        GREEN("Lilo");
        
        private String guj;
        public String getGuj() {
            return guj;
        }
    
        TrafficLight(String guj){
            System.out.println("Constructor called");
            this.guj = guj;
        }
        public void display(){
            System.out.println(this.name());
        }
    }
    public static void main(String []args){
        EnumDemo  demo = new EnumDemo();
        TrafficLight colour = TrafficLight.GREEN;
        System.out.println(colour.getGuj());
        // int ordinal = colour.ordinal();
        // System.out.println(ordinal+" "+colour.name().toLowerCase());
        
        // TrafficLight newColour = TrafficLight.valueOf("RED");
        // System.out.println(newColour);

        // colour.display();
        // newColour.display();
        System.out.println();
        System.out.println(demo.getAction(colour));
    }

    public String getAction(TrafficLight colour){
        String res = switch(colour){
            case RED -> "Stop";
            case YELLOW -> "Ready";
            case GREEN -> "Go";
            default -> "Wrong Input";
        };

        return res;
    }
}