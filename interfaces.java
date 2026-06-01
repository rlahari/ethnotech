interface upi{
    void payonline();
}
interface cash{
    void payoffline();
}
class payment implements upi,cash{
    public void payonline(){
        System.out.println("use online payment to pay");
    }
    public void payoffline(){
        System.out.println("pay cash ");
    }
    public void display(){
        payonline();
        payoffline();
        System.out.println("Thank You for the payment");
    }
}
public class interfaces {
   public static void main(String[] args) {
       payment ob=new payment();
       ob.display();
   } 
}