package chain_of_responsibility;

/**
 * Created by Vladok on 20.11.2016.
 */
public class YahooHandler extends MailHandler {
    @Override
    public void Handle(Receiver receiver) {
        if(receiver.isYahoomail())
            System.out.println("Yahoo Sending");
        else Succesor.Handle(receiver);
    }
}
