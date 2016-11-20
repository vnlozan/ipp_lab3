package chain_of_responsibility;

/**
 * Created by Vladok on 20.11.2016.
 */
public class MailRUHandler extends MailHandler {
    @Override
    public void Handle(Receiver receiver) {
        if(receiver.isMailru())
            System.out.println("MailRU sending");
        else Succesor.Handle(receiver);
    }
}
