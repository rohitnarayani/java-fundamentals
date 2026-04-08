package innerclass.anonymous_innerclass;

public class AlertTest {
    public static void main(String []args){
        Alert email = (new Alert(){
            public void trigger(String message){
                System.out.println("[Email Alert]: "+message);
            }
        });

        Alert sms = (new Alert(){
            public void trigger(String message){
                System.out.println("[SMS Alert]: "+message);
            }
        });

        Alert push = (new Alert(){
            public void trigger(String message){
                System.out.println("[PUSH Alert]: "+message);
            }
        });

        email.trigger("200 OK");
        sms.trigger("404 BAD");
        push.trigger("501 BAD");
    }
}