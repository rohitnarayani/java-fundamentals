package innerclass.anonymous_innerclass;

public class WorkoutTest {
    public static void main(String []args){
        Workout running = (new Workout(){
            void exercise(){
                System.out.println("Running 5km...");
            }
        });
        Workout cycling = (new Workout(){
            void exercise(){
                System.out.println("Cycling 15km...");
            }
        });
        Workout swimming = (new Workout(){
            void exercise(){
                System.out.println("Swimming 20 laps...");
            }
        });

        running.start();
        swimming.start();
        cycling.start();
    }
}
