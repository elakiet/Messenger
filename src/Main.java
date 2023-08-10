// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SMSMessagingService smsMessagingService=new SMSMessagingService();
        EmailMessagingService emailMessagingService=new EmailMessagingService();
        WhatsAppMessagingService whatsAppMessagingService=new WhatsAppMessagingService();

        smsMessagingService.SendMsg();
        emailMessagingService.SendMsg();
        whatsAppMessagingService.SendMsg();
    }
}
interface MessageService{

    abstract void SendMsg();
}
class SMSMessagingService implements MessageService {
    Scanner scan = new Scanner(System.in);
    String Msg= scan.nextLine();
    @Override
    public void SendMsg() {
        System.out.println("SMS MESSAGE");
        System.out.println("Send a Message:"+Msg);
        System.out.println();
    }
}
class EmailMessagingService implements MessageService{
    Scanner scan = new Scanner(System.in);
    String Msg= scan.nextLine();
    @Override
    public void SendMsg() {
        System.out.println("EMAIL MESSAGE");
        System.out.println("Send a Message:" +Msg);
        System.out.println();
    }
}
class WhatsAppMessagingService implements MessageService{
    Scanner scan = new Scanner(System.in);
    String Msg= scan.nextLine();
    @Override
    public void SendMsg() {
        System.out.println("WHATSAPP MESSAGE");
        System.out.println("Send a Message:" +Msg);
    }
}
