package innerclass.local_innerclass;

public class Shop {
    public void generateInvoice(String customerName,int qty,double price){
        class Invoice{
            public void invoice(){
                double total=price*qty;
                double gst = (18*total)/100;
                System.out.println("--------Invoice--------");
                System.out.println("Customer: "+customerName);
                System.out.println("Items: "+qty+" x $"+price+" = "+total);
                System.out.println("GST (18%): $"+gst);
                System.out.println("Total: $"+(total+gst));
                
            }
        }

        Invoice  in = new Invoice();
        in.invoice();
    }
}
