package chain_of_responsibility;

/**
 * Created by Vladok on 20.11.2016.
 */
public class GmailHandler extends MailHandler {
    @Override
    public void Handle(Receiver receiver) {
        if(receiver.isGmail())
            System.out.println("Gmail Sending");
        else Succesor.Handle(receiver);
    }
}
