package chain_of_responsibility;

/**
 * Created by Vladok on 20.11.2016.
 */
public abstract class MailHandler {
    protected MailHandler Succesor;
    public abstract void Handle(Receiver receiver);

    public MailHandler getSuccesor() {
        return Succesor;
    }

    public void setSuccesor(MailHandler succesor) {
        Succesor = succesor;
    }
}
