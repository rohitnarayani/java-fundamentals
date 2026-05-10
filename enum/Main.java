public class Main {
    
    public enum Operation{

        ADD{
            double apply(double a , double b){
                return a+b;
            }
        },
        
        SUBTRACT{
            double apply(double a,double b){
                return a-b;
            }
        },

        MULTIPLY{
            double apply(double a,double b){
                return a*b;
            }
        },

        DIVIDE{
            double apply(double a,double b){
                return a/b;
            }
        };
          
        abstract double apply(double a,double b);
    }

    public static void main(String []args){
        for(Operation op : Operation.values()){
            System.out.println(op+" -> "+op.apply(40.3,22.3));
        }
    }
}
