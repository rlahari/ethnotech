interface instamessage{
    void instagram();
}
interface whatsappmessage{
    void whatsapp();
}

class message implements instamessage,whatsappmessage{
    public void instagram(){
        System.out.println("itx_deekshi liked your story");
    }
    public void whatsapp(){
        System.out.println("madhu had sent you a message ");
    }
    public void display(){
        instagram();
        whatsapp();
        System.out.println("Thank You for chatting and liking");
    }
}
public class messageinterfaces{
   public static void main(String[] args) {
       payment ob=new payment();
       ob.display();
   } 
}